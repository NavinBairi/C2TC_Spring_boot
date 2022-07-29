package com.tns.springbeanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class StudentDao {
	
  private String driver ;
  private String url;
  private String username ;
  private String password ;
  
  
  
  
 public void setDriver(String driver) {
	this.driver = driver;
}


public void setUrl(String url) {
	this.url = url;
}





public void setUsername(String username) {
	this.username = username;
}





public void setPassword(String password) {
	this.password = password;
}





public void selectAllRows() throws SQLException ,ClassNotFoundException 
  {
	  //load driver
	  Class.forName(driver); 
	  //get connection
  Connection con = DriverManager.getConnection(url, username, password);
  
  //execute query 
  Statement stmt = con.createStatement();
  ResultSet rs = stmt.executeQuery("select * from demo.user");
  while(rs.next())
  {
	  int userid = rs.getInt(1);
	  String username = rs.getString(2);
	  System.out.println("id is " + userid + "and name is " +username);  }
		  
  }
}
