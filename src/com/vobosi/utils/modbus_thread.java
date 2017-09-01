package com.vobosi.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletContext;

import com.vobosi.dao.pau.paustatusDao;

/*modbus协议数据交互线程类*/
public class modbus_thread extends Thread {
	// modbus的ip地址 及id从站号
	private String ipset = "";
	private Integer idset = 0;
	private ServletContext servletContext = null;
	private paustatusDao pD;

	// private driveDBW driveDBW=new driveDBW();
	// 构造方法给ip及id赋值
	public modbus_thread(String ip, Integer id, ServletContext context, paustatusDao pau) {
		ipset = ip;
		idset = id;
		servletContext = context;
		pD = pau;
	}

	// modbus数据交互线程代码数据采集写入数据库写入modubs都在这里完成
	public void run() {
		// 给modbus驱动设置ip及id
		@SuppressWarnings("unused")
		modbusMaster Master = new modbusMaster(ipset, idset);
		/* 时间转换的中间变量 */
		int lastIndexOf = 0;
		String tf = "";
		String subStr = "";
		Integer second = 0;
		/* modbus读操作的中间变量 */
		String readModbusstr = "";
		Random random = new Random();
		String str = "";
		int nextInt = 0;
		StringBuffer sb = new StringBuffer();
		String substring = "";
		int statusNum = 0;
		String stime = "";

		while (true) {
			try {
				try {
					/* 格式化当前时间获取秒 */
					tf = DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
					lastIndexOf = tf.lastIndexOf(":");
					subStr = tf.substring(lastIndexOf + 1, tf.length());
					second = Integer.valueOf(subStr);
					/* 格式化当前时间获取秒end */
				} catch (Exception e) {
					System.out.println("时间转换错误");
				}

				// modbus读取操作
				readModbusstr = Master.readModbus_FC03(1, 8);
				servletContext.setAttribute("modbusRunTimeData_XF1", readModbusstr);
				System.out.println(
						"新风机组1#的modbus实时数据为: " + second + " " + servletContext.getAttribute("modbusRunTimeData_XF1"));
				// 每隔20秒采集一次数据写入context，每分钟写入一次数据库
				if (second == 20 && statusNum == 0) {
					// 存储每一条记录都要写入一个int的时间
					stime = new SimpleDateFormat("yyMMddHHmm").format(new Date());
					// substring = stime.substring(2, stime.length());
					sb.append(stime + ":");
					sb.append(readModbusstr + "-");
					statusNum = 1;
				} else if (second == 39 && statusNum == 1) {
					sb.append(readModbusstr + "-");
					statusNum = 2;
				} else if (second == 59 && statusNum == 2) {
					sb.append(readModbusstr);
					statusNum = 0;

					// 此处应写入数据库,使用异步方式
					driveDBW dd = new driveDBW(pD, sb.toString());
					Thread t = new Thread(dd, "driveDBW");
					// 启动modbus数据交互线程
					t.start();

					// 最后清空字符串缓冲区
					sb.delete(0, sb.length());
				}

				// modbus写入操作
				/*从context域中查找是否有要写入modbus设备的数据
				 数据格式为: 温度设定and湿度设定and压力设定and开关机设定
				 */
				String modbusSet=(String)servletContext.getAttribute("modbusSetData_XF1");
				//调用modbus方法写入设备控制值
				if(null!=modbusSet && !"".equals(modbusSet)){
					Master.writeModbus_FC16(10, modbusSet);
					//写入成功就删除Context域值
					servletContext.removeAttribute("modbusSetData_XF1");
					//通过context域变量反馈给视图层，让视图层判断是否写入成功
					servletContext.setAttribute("modbusSetDataBack_XF1", modbusSet);
				}
				/* make假数据操作最多8个数据用&分割拼接到一起 */
				/*
				 * for (int i = 0; i < 8; i++) { nextInt = random.nextInt(100);
				 * sb.append(str.valueOf(nextInt) + "&"); }
				 */
				// 去除最后一个&
				/* substring = sb.toString().substring(0, sb.length()); */
				/* make假数据操作最多8个数据用&分割拼接到一起end */

				// 执行modbus写入操作
				// Master.writeModbus_FC16(1,substring);
				// 执行写入bool操作00001开始
				// Master.writeModbus_FC05(1,false);
				/* 执行写入10个bool值 */
				// Master.writeModbus_FC15(1, "true&");

				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("modbus驱动线程读写异常" + e.getMessage());
			}
		}
	}
}
