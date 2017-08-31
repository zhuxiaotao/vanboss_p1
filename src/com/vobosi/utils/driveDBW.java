package com.vobosi.utils;
import com.vobosi.dao.pau.paustatusDao;
import com.vobosi.pojo.pau.paustatus;

public class driveDBW extends Thread{
	//dao类与要写入的数据
	private String dataFromContext="";
	private paustatusDao pd;
	//初始化
	public driveDBW(paustatusDao paustatusDao,String dfc){
		pd=paustatusDao;
		dataFromContext=dfc;
	}
	
	public void run(){
		saveDB(dataFromContext,pd);
	}
	
	/* 数据存储库操作(以新风机1#为例) */
	public String saveDB(String dataFromContext,paustatusDao pd) {
		try {
			// 创建一个新风机对象用于持久化层
			paustatus paustatus = new paustatus();
			// 解析传进来的时间以及数据信息,分别是时间信息与数据信息
			String[] mastersSplit = dataFromContext.split(":");
			String[] slaveSplit = mastersSplit[1].split("-");
			String[] slaveData = new String[16];
			int indexNum = 0;
			if (mastersSplit.length == 2) {
				// 存入时间
				paustatus.setStime(Integer.valueOf(mastersSplit[0]));
				// 解析并存入数据
				if (slaveSplit.length == 3) {
					for (String str : slaveSplit) {
						if (indexNum == 0) {
							// 解析出0秒的数据
							slaveData = str.split("and");
							paustatus.setFre1(Integer.valueOf(slaveData[0]));
							paustatus.setHumns1(Integer.valueOf(slaveData[1]));
							paustatus.setHumos1(Integer.valueOf(slaveData[2]));
							paustatus.setPreos1(Integer.valueOf(slaveData[3]));
							paustatus.setTemns1(Integer.valueOf(slaveData[4]));
							paustatus.setTemos1(Integer.valueOf(slaveData[5]));
							paustatus.setStatus1(slaveData[6]);
							indexNum = 1;
						} else if (indexNum == 1) {
							// 解析出20秒的数据
							slaveData = str.split("and");
							paustatus.setFre2(Integer.valueOf(slaveData[0]));
							paustatus.setHumns2(Integer.valueOf(slaveData[1]));
							paustatus.setHumos2(Integer.valueOf(slaveData[2]));
							paustatus.setPreos2(Integer.valueOf(slaveData[3]));
							paustatus.setTemns2(Integer.valueOf(slaveData[4]));
							paustatus.setTemos2(Integer.valueOf(slaveData[5]));
							paustatus.setStatus2(slaveData[6]);
							indexNum = 2;
						} else if (indexNum == 2) {
							// 解析出40秒的数据
							slaveData = str.split("and");
							paustatus.setFre3(Integer.valueOf(slaveData[0]));
							paustatus.setHumns3(Integer.valueOf(slaveData[1]));
							paustatus.setHumos3(Integer.valueOf(slaveData[2]));
							paustatus.setPreos3(Integer.valueOf(slaveData[3]));
							paustatus.setTemns3(Integer.valueOf(slaveData[4]));
							paustatus.setTemos3(Integer.valueOf(slaveData[5]));
							paustatus.setStatus3(slaveData[6]);
							indexNum = 0;
						}
					}
					/*写入数据库操作*/
					pd.insertSelective(paustatus);
					System.out.println("持久化正确执行完毕");
					return "good save";
				}
				System.out.println("持久化执行错误");
				return "bad save";
			}
		} catch (Exception e) {
			System.out.println("新风机1#持久化层存储异常");
		}
		System.out.println("持久化执行错误");
		return "bad save";
	}
}
