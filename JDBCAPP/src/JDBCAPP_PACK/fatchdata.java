package JDBCAPP_PACK;
import java.sql.*;
public class fatchdata{
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getString("id")+"  " + rs.getString("name")+"  " + rs.getString("salary") +"  "+ rs.getString("email"));
			}
		}
		else
		{
			System.out.println("not conneectes");
		}
	}
}
