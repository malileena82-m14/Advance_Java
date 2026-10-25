package org.jdbcs;

import java.sql.DriverManager;
import java.sql.SQLException;

public class demoApp {

	public static void main(String[] args) throws SQLException{
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(d);
		//Class.forName("com.mysql.cj.jdbc.Driver");
        
		System.out.println("Driver registerd Successfully");
	}

}
