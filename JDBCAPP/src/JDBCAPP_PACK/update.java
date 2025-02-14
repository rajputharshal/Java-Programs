package JDBCAPP_PACK;
import java.util.*;
import java.sql.*;
public class update {
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id where change");
			int id=sc.nextInt();
			System.out.println("name");
			String name=sc.next();
			System.out.println("salary");
			int salary=sc.nextInt();
			Statement stm=con.createStatement();
			int val=stm.executeUpdate("update employee set name='"+name+"',salary='"+salary+"' where id='"+id+"'");
			if(val>0)
			{
				System.out.println("information updates");
			}
			else
			{
				System.out.println("somthing wrong");
			}
		}
		else
		{
			System.out.println("not conneectes");
		}
	}
}
