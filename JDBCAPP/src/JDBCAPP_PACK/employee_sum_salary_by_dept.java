package JDBCAPP_PACK;
import java.sql.*;
public class employee_sum_salary_by_dept
{
	public static void main( String arg[]) throws  Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select d.dname,sum(e.salary) from employee e join dept d on e.dpid=d.dpid group by e.dpid");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));		
			}
	}
}
