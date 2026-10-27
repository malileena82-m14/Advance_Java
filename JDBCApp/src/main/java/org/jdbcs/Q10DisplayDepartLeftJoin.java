/*Tables: departments, employees
Description: Display every department, including departments that do not currently have employees.
Expected behavior:
Display department ID, department name, employee ID, and employee name.
Use a LEFT JOIN.
Show departments with no employees as well.
Sort the results by department name.
*/

package org.jdbcs;
import java.sql.*;
import java.util.*;
public class Q10DisplayDepartLeftJoin {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/march26","root","14062004");
		if(conn!=null)
		{
			System.out.println("Database is connected");
			PreparedStatement p = conn.prepareStatement("select d.department_id,d.department_name,e.eid,e.ename from department d left join employees e on d.department_id = e.department_id order by department_name");
			ResultSet rs = p.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			}
		}
		else
		{
			System.out.println("Database not connected");
		}
	}

}
