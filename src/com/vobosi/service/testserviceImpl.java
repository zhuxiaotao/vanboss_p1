package com.vobosi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ServletContextAware;

import com.vobosi.Interface.testservice;
import com.vobosi.dao.pau.paustatusDao;
import com.vobosi.pojo.pau.paustatus;
import com.vobosi.pojo.pau.paustatusQuery;
import com.vobosi.pojo.pau.paustatusQuery.Criteria;

@Service("testservice")
@Transactional
public class testserviceImpl implements testservice, ServletContextAware {
	@Autowired
	private paustatusDao paustatusDao;

	@Override
	public void savepaustatus() {
		try {
			paustatus paustatus = new paustatus();
			// 格式化时间
			String stime = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
			String substring = stime.substring(2, stime.length());
			int time = Integer.parseInt(substring);
			// 保存记录
			paustatus.setStime(time);
			paustatus.setFre1(RandomUtils.nextInt(0, 50));
			paustatus.setFre2(RandomUtils.nextInt(0, 50));
			paustatus.setFre3(RandomUtils.nextInt(0, 50));
			paustatus.setHumns1(RandomUtils.nextInt(0, 100));
			paustatus.setHumns2(RandomUtils.nextInt(0, 100));
			paustatus.setHumns3(RandomUtils.nextInt(0, 100));
			paustatus.setHumos1(RandomUtils.nextInt(0, 100));
			paustatus.setHumos2(RandomUtils.nextInt(0, 100));
			paustatus.setHumos3(RandomUtils.nextInt(0, 100));
			paustatus.setPreos1(RandomUtils.nextInt(0, 1000));
			paustatus.setPreos2(RandomUtils.nextInt(0, 1000));
			paustatus.setPreos3(RandomUtils.nextInt(0, 1000));
			paustatus.setStatus1("NNN");
			paustatus.setStatus2("NNN");
			paustatus.setStatus3("NNN");
			paustatus.setTemns1(RandomUtils.nextInt(25, 35));
			paustatus.setTemns2(RandomUtils.nextInt(0, 35));
			paustatus.setTemns3(RandomUtils.nextInt(0, 35));
			paustatus.setTemos1(RandomUtils.nextInt(0, 35));
			paustatus.setTemos2(RandomUtils.nextInt(0, 35));
			paustatus.setTemos3(RandomUtils.nextInt(0, 35));
			paustatusDao.insertSelective(paustatus);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 删除一条记录
	@Override
	public void deldata(int stime) {
		paustatusQuery paustatusQuery = new paustatusQuery();
		Criteria createCriteria = paustatusQuery.createCriteria();
		createCriteria.andStimeEqualTo(stime);
		paustatusDao.deleteByExample(paustatusQuery);
	}

	// 删除一个时间范围外的
	@Override
	public void delalldata(int stime) {
		paustatusQuery paustatusQuery = new paustatusQuery();
		Criteria createCriteria = paustatusQuery.createCriteria();
		createCriteria.andStimeGreaterThan(stime);
		paustatusDao.deleteByExample(paustatusQuery);
	}

	// 倒序查找数据
	@Override
	public String showdata() {
		paustatusQuery paustatusQuery = new paustatusQuery();
		Criteria createCriteria = paustatusQuery.createCriteria();
		createCriteria.andStimeGreaterThan(1);
		paustatusQuery.setOrderByClause("stime desc");
		paustatusQuery.setPageNo(1);
		paustatusQuery.setPageSize(100);
		List<paustatus> selectByExample = paustatusDao.selectByExample(paustatusQuery);

		StringBuilder sb = new StringBuilder();
		for (paustatus paustatus : selectByExample) {
			float f = Float.parseFloat(paustatus.getTemns1().toString());
			sb.append(f);
			sb.append(",");
		}
		String s = sb.toString().substring(0, sb.length() - 1) + "+";

		StringBuilder sb1 = new StringBuilder();
		for (paustatus paustatus : selectByExample) {
			sb1.append(paustatus.getStime().toString().substring(5));
			sb1.append(",");
		}
		s = s + sb1.toString().substring(0, sb1.length() - 1);

		return s;
	}

	// 获取context域对象
	private ServletContext servletContext;
	@Override
	public void setServletContext(ServletContext sc) {
		this.servletContext = sc;
		servletContext.setAttribute("hehe", "haha");
	}

}
