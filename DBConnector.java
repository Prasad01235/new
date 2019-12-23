package com.oudoctor;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

public class DBConnector
{
String url="jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12316659";
String un="sql12316659";
String pw="FRAhLT7vWK";
Connection con=null;
public Connection giveConnection()
{
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,un,pw);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
      return con;
}
}
