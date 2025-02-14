package JDBCAPP_PACK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class employee_salary_name
{
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Statement stm=con.createStatement();
			System.out.println("id\tcount");

			ResultSet rs=stm.executeQuery("select dpid,count(*) from employee group by dpid");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +" \t"+ rs.getInt(2));
			}
		}
		else
		{
			System.out.println("somthing wrong");
		}
		
	}
}
