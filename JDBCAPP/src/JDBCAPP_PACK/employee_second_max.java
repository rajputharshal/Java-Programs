package JDBCAPP_PACK;
import java.sql.*;
public class employee_second_max
{
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select salary,count(*) from employee group by salary having count(*)>1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +" "+ rs.getInt(2));
			}
		}
		else
		{
			System.out.println("somthing wrong");
		}
		
	}
}
