package JDBCAPP_PACK;
import java.sql.*;
public class Loadmysql  {
	public static void main(String args[])throws SQLException
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/april","root","12345");
		System.out.println("connect with="+con);
		if(con!=null)
		{
			Statement stm=con.createStatement();
			int val=stm.executeUpdate("insert into city values(7,'nagpur')");
			if(val>0)
			{
				System.out.println("data enter succesfully....");
			}
			else
			{
				System.out.println("sonthig wrong");
			}
		}
		else 
		{
			System.out.println("somthing wrong");
		}
	}
}
