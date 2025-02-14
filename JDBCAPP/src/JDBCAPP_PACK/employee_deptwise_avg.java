package JDBCAPP_PACK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class employee_deptwise_avg {
	public static void main( String arg[]) throws  Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select dpid,avg(salary) from employee group by dpid");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getInt(2));		
			}
	}
}
