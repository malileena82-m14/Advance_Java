package org.jdbcs;
import java.sql.*;
import java.util.*;

public class DeleteRecord {

	public static void main(String[] args)throws Exception 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/march26","root","14062004");
		if(conn!=null)
		{
			Scanner xyz = new Scanner(System.in);
			System.out.println("Database is created");
			System.out.println("Enter id of employee");
			int emid = xyz.nextInt();
			Statement s = conn.createStatement();
			int value = s.executeUpdate("delete from employee where eid = "+emid+"");
			if(value>0)
			{
				System.out.println("Record deleted successfully");
			}
			else
			{
				System.out.println("Record not save in database");
			}
		}
		else
		{
			System.out.println("Database is not connected");
		}
	}

}
