package com.tns.springbeanlifecycle;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
	     StudentDao s1= c.getBean("studentDao",StudentDao.class);
		s1.selectAllRows();
		//s1.deleteData();
		
	}

}
