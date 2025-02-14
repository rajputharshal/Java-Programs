package JDBCAPP_PACK;
import java.sql.*;
public class employee_name_dpname_maxSalary
{
	public static void main( String arg[]) throws  Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select e.name,d.dname from dept d join  employee e on d.dpid=e.dpid where e.salary=(select max(salary) from employee)");
		while(rs.next())
		{
			System.out.println(rs.getString("name")+ "\t"+rs.getString("dname"));
		}
	}
}
