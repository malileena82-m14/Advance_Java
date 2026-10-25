package org.jdbcs;
import java.sql.*;
public class connection {

	public static void main(String[] args) throws Exception
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/march26","root","14062004");
		
		if(conn!=null)
		{
			System.out.println("Database is connected");
		}
		else
		{
			System.out.println("Database is not connected");
		}
	}
}
