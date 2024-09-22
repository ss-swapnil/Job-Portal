package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn;
	public static Connection getConn() {
		
		try
		{
			if(conn==null)
			{
				
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##swapnil","shende");
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/job_portal","root","Papaji@123");
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}

}
