package JDBCAPP_PACK;
import java.sql.*;
import java.util.*;
public class insert_dept 
{
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter deparment name");
		String name=sc.next();
		Statement stm=con.createStatement();
		int val=stm.executeUpdate("insert into dept values('"+id+"','"+name+"')");
		if(val>0)
		{
			System.out.println("value inserted");
		}
		else
		{
			System.out.println("somthing wrong");
		}
		
	}
}
