package com.vobosi.utils;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;

import PLCComMB.ModbusMaster;
import PLCComMB.OperationResult;
import PLCComMB.PortStateEventHandler;
import PLCComMB.ReadRequest;
import PLCComMB.ReadResult;
import PLCComMB.ReadValue;
import PLCComMB.ReadWriteRegisterRequest;
import PLCComMB.ReadWriteRegisterResult;
import PLCComMB.RequestBuilder;
import PLCComMB.WriteRequest;
import PLCComMB.WriteResult;
import PLCComMB.iConnectionStateChangeEvent;
import PLCComMB.Enums.eByteOrder;
import PLCComMB.Enums.eConnectionState;
import PLCComMB.Enums.eDataType;
import PLCComMB.Enums.eReadFunction;
import PLCComMB.Enums.eRegisterMode;
import PLCComMB.Enums.eWriteFunction;

public class modbusMaster implements iConnectionStateChangeEvent, Serializable {
	// <editor-fold defaultstate="collapsed" desc="CreateAndInitDevice">
	// Declare the Modbus master Device
	//创建modbus驱动必要的对象
	private ModbusMaster Device = null;
	private PortStateEventHandler portStateEventHandler = new PortStateEventHandler(this);
	//modbus读写缓冲区好像超过60不好使（此处为自己定义的）
	private short[] shortnum =new short[8];
	//读取缓冲区short
	private short[] readBufferS=new short[8];
	private short[] writeBufferS =new short[8];
	//读写缓冲区float
	private float[] readBufferF=new float[8];
	private float[] writeBufferF=new float[8];
	private boolean[] writeBufferBool=new boolean[8];
	
	//读写缓冲区size
	private Integer numSize=1;
	//modbus通讯必须传入的参数从站的ip及id
	private String ipset="";
	private Integer idset=0;
	//构造函数用于创建modbus连接
	public modbusMaster(String ip,Integer id) {
		System.out.println("modbus通讯类初始化");
		for (int i = 0; i < shortnum.length; i++) {
			shortnum[i]=0;
			writeBufferS[i]=0;
		};
		//给modbus从站信息和读写缓冲区大小赋值
		numSize=shortnum.length;
		ipset=ip;
		idset=id;
		//创建modbus连接的方法
		CreateAndInitDevice();
	}
	
	//modbus初始化方法
	private void CreateAndInitDevice() {
		//创建modbus连接的标准流程begin
		Device = new ModbusMaster();

		Device.setUser("my user name from licence document");
		Device.setSerial("my serial from licence document");

		try {
			// "TCP" interface:
			//此处为tcp连接modbus端口号固定为502
			Device.setConnector_TCP(ipset, 502);
			// set max idleTime (max idle timespan in milliseconds between open
			// and close interface or connection), Standard = 10000ms
			//设置超时时间
			Device.getConnector().setMaxIdleTime(5000);
			// Set RegisterMode >> 16bit or 32bit register, settings must match
			// with settings of slave
			//不知道干啥用的
			Device.setRegisterMode(eRegisterMode._16Bit);
			// register OnConnectionStateChange event
			Device.getConnector().addConnectionStateEventHandler(portStateEventHandler);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return;
		}
	}
	
	//通讯状态发生改变后的回调函数
	@Override
	public void On_ConnectionStateChange(eConnectionState e) {
		//此处可以自定义通讯状态改变后的业务逻辑
		System.out.println("通讯状态发生改变  ==> " + e.toString());
	}
	
	//原程序的集中使用多个fc功能的方法
	public void AccessToModbus() {
		try {
			// write data (FC5,6,15,16)
			//写入modbus 从站的数据此处为10*56个short变量
			//modbus读写缓冲区为56
			for (int i = 0; i < 8; i++) {
				writeModbus_FC16(i*8+1,"+");
			}
			System.out.println("-----------------------------------------------------------------");
			// read data (FC1-4)
			//读出modbus 从站的数据此处为10*10个short变量
			//modbus读写缓冲区为10
			for (int i = 0; i < 8; i++) {
				readModbus_FC03(i*8+1,8);
			}
			// read write (FC 23)
			//同时读写modbus的方法未用过
			// readWriteRegister();
		} catch (Exception ex) {
			System.out.println("modbus驱动抛异常了" + ex.getMessage());
			return;
		}
	}

	//modbus读操作
	/**
	 * 读取40001开始地址
	 * @param begain 读取开始地址
	 * @param num 读取的个数
	 * @return string 返回读取到的结果，结果以+分割，8个数据
	 */
	public String readModbus_FC03(int begain,int num) {
		//此对象为modbus读请求的对象
		ReadRequest myReadRequest = RequestBuilder.ReadRequestBuilder.create(idset, // Slave的ID
				eReadFunction.F03_Read_Holding_Registers, // modbus功能号
				begain, // 读取寄存器开始地址
				eDataType.SHORT, // 读取寄存器数据类型
				num); // 读取寄存器数量
		myReadRequest.setByteOrder(eByteOrder.AB_CD);
		// read from device
		ReadResult res = Device.read(myReadRequest);
		/*以下是读出数据并解析数据的方法*/
		if (res.getQuality().equals(OperationResult.eQuality.GOOD)) {
			//存储解析值的临时字符串变量变量
			StringBuilder sb = new StringBuilder();
			for (ReadValue item : res.fetchValues()) {
				/*此句是获得读取的modbus变量地址
				sb.append("Address " + String.valueOf(item.getAddress()) + 
						" / Pos"+ String.valueOf(item.getAddressPosition()));
				sb.append(" >> ");*/
				// 读取出的数值在这里
				sb.append(item.toString()+"and");
			}
			String str = sb.toString();
			return str.substring(0, str.length()-3);
			}
		return "no read";
	}
	
	/**
	 * 读取10001开始地址
	 * @param begain 读取开始地址
	 * @param num 读取的个数
	 * @return string 返回读取到的结果，结果以+分割，8个数据
	 */
	public String readModbus_FC02(int begain,int num) {
		//此对象为modbus读请求的对象
		ReadRequest myReadRequest = RequestBuilder.ReadRequestBuilder.create(idset, // Slave的ID
				eReadFunction.F02_Read_Discrete_Inputs, // modbus功能号
				begain, // 读取寄存器开始地址
				eDataType.BYTE, // 读取寄存器数据类型
				num); // 读取寄存器数量
		myReadRequest.setByteOrder(eByteOrder.AB_CD);
		// read from device
		ReadResult res = Device.read(myReadRequest);
		/*以下是读出数据并解析数据的方法*/
		if (res.getQuality().equals(OperationResult.eQuality.GOOD)) {
			//存储解析值的临时字符串变量变量
			StringBuilder sb = new StringBuilder();
			for (ReadValue item : res.fetchValues()) {
				/*此句是获得读取的modbus变量地址
				sb.append("Address " + String.valueOf(item.getAddress()) + 
						" / Pos"+ String.valueOf(item.getAddressPosition()));
				sb.append(" >> ");*/
				// 读取出的数值在这里
				sb.append(item.toString()+"+");
			}
			String str = sb.toString();
			return str.substring(0, str.length()-1);
			}
		return "no read";
	}
	
	/**
	 * FC16写入数据40001开始
	 * @param begin 读取的开始地址必须是1以后开始
	 * @param writeString 写入值的传入字符串每个数据以“&”分割
	 */
	//写入数据最大长度10个，要写入的数据中间以+分割
	public void writeModbus_FC16(int begin,String writeString) {
		//解析需要写入的字符串
		String[] split = writeString.split("&");
		int i=0;
		//解析成short并写入modubs写入缓冲区
		for (String str : split) {
			try {
				Integer val = Integer.valueOf(str);
				short sVal = val.shortValue();
				writeBufferS[i]=sVal;
				i++;
			} catch (Exception e) {
				System.out.println(writeBufferS[i]);
				i++;
			}
		}
		// 此对象为modbus写请求的对象
		WriteRequest myWriteRequest = RequestBuilder.WriteRequestBuilder.create(idset,
				// 从站id
				eWriteFunction.F16_Write_Multiple_Registers,
				// 设置modbus功能号此处为FC16写多个寄存器
				begin);// 设置写寄存器的起始地址
		myWriteRequest.setByteOrder(eByteOrder.AB_CD);
		// 写入寄存器的写入值
		myWriteRequest.addShortRange(writeBufferS);
		// modbus写入操作方法
		WriteResult res = Device.write(myWriteRequest);
	}
	
	/**
	 * FC05写入数据00001开始
	 * @param begin 读取的开始地址必须是1以后开始
	 * @param writeString 写入值的传入truehuo
	 */
	//写入单个布尔值
	public void writeModbus_FC05(int begin,Boolean b) {
		// 此对象为modbus写请求的对象
		WriteRequest myWriteRequest = RequestBuilder.WriteRequestBuilder.create(idset,
				// 从站id
				eWriteFunction.F05_Write_Single_Coil,
				// 设置modbus功能号此处为FC16写多个寄存器
				begin);// 设置写寄存器的起始地址
		myWriteRequest.setByteOrder(eByteOrder.AB_CD);
		// 写入寄存器的写入值
		myWriteRequest.addBoolean(b);
		// modbus写入操作方法
		WriteResult res = Device.write(myWriteRequest);
	}
	
	/**
	 * FC15写入数据00001开始
	 * @param begin 读取的开始地址必须是1以后开始
	 * @param writeString 写入值的传入布尔值数组
	 */
	//写入单个布尔值
	public void writeModbus_FC15(int begin,String writeString) {
		String[] boolStr = writeString.split("&");
		int i=0;
		//解析成short并写入modubs写入缓冲区
		for (String str : boolStr) {
			try {
				/*字符串转*/
				if("true".equals(str)){
					writeBufferBool[i]=true;
				}else if("false".equals(str)){
					writeBufferBool[i]=false;
				}else{
					writeBufferBool[i]=false;
				}
				i++;
			} catch (Exception e) {
				System.out.println("布尔量转换错误");
				writeBufferBool[i]=false;
				i++;
			}
		}
		/*如果传过来的字符串不足转换为8个写入数据位那么补全8个数据位*/
		if(i<7){
			for (int j = i; j < 8; j++) {
				writeBufferBool[j]=true;
			}
		}
		// 此对象为modbus写请求的对象
		WriteRequest myWriteRequest = RequestBuilder.WriteRequestBuilder.create(idset,
				// 从站id
				eWriteFunction.F15_Write_Multiple_Coils,
				// 设置modbus功能号此处为FC16写多个寄存器
				begin);// 设置写寄存器的起始地址
		myWriteRequest.setByteOrder(eByteOrder.AB_CD);
		// 写入寄存器的写入值
		myWriteRequest.addBooleanRange(writeBufferBool);;
		// modbus写入操作方法
		WriteResult res = Device.write(myWriteRequest);
	}
	
	//modbus读写操作
	private void readWriteRegister() {
		System.out.println("start read/write modbus (FC23)");
		// declare a ReadRequest object
		// and set the request parameters
		// ReadWriteRequest will allways using FC23
		// Read 6 register at adress 80 and write 4 register at adress 100
		ReadWriteRegisterRequest myReadWriteRequest = RequestBuilder.ReadWriteRequestBuilder.create(idset, // Slave
				80, // ReadAddress
				eDataType.USHORT, // Target Datattype
				6, // quantity of objects to be read
				100); // WriteAddress
		// set eventual byte order, standard = eByteOrder.AB_CD;
		myReadWriteRequest.setByteOrder(eByteOrder.AB_CD);
		// write 4 holding register at adress 100
		myReadWriteRequest.addPLC_WORDRange(new int[] { 21, 22, 23, 24 });
		System.out.println(myReadWriteRequest.toString());
		// read from device
		ReadWriteRegisterResult res = Device.readWrite(myReadWriteRequest);
		// evaluate results
		System.out.println(
				DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()) + ": " + res.getMessage());
		if (res.getQuality().equals(OperationResult.eQuality.GOOD)) {
			int counter = 0;
			StringBuilder sb = new StringBuilder();
			for (Object value : res.fetchValues()) {
				sb.append(String.valueOf(counter++));
				sb.append(" >> ");
				sb.append(value.toString());
				sb.append(System.getProperty("line.separator"));
			}
			System.out.println(sb.toString());
		}
		System.out.println("end read/write modbus (FC23)");
		System.out.println(System.getProperty("line.separator"));
	}
	// </editor-fold>
}