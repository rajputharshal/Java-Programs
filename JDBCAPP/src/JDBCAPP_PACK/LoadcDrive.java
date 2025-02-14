package JDBCAPP_PACK;
import java.sql.*;
public class LoadcDrive {
	public static void main(String args[])throws SQLException
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		if(d!=null)
		{
			System.out.println("welcome in mysql");
		}
		else
		{
			System.out.println("somthing wrong");
		}
		
	}
}
