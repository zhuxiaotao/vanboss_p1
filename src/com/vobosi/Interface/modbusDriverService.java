package com.vobosi.Interface;
import javax.servlet.ServletContext;
import com.vobosi.dao.pau.paustatusDao;
//modbus通讯接口
public interface modbusDriverService {
	/**
	 * modbus通讯线程需要实现的接口
	 * @param ip modbus从站的ip地址
	 * @param id modbus从站的id地址
	 */
	public void modbusDriver(String ip, Integer id);
}
