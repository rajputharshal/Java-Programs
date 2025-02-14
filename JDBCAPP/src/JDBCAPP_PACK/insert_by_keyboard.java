package JDBCAPP_PACK;
import java.sql.*;
import java.util.*;
public class insert_by_keyboard {
	public static void main(String arg[]) throws Exception
	{
		
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
	if(con!=null)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("enter salarey");
		int sal=sc.nextInt();
		System.out.println("Enter Email");
		String email=sc.next();
		Statement stm=con.createStatement();
		
		int val=stm.executeUpdate("insert into employee values('"+id+"','"+name+"','"+sal+"','"+email+"')");
		
		if(val>0)
		{
			System.out.println("values enteres");
		}
		else
		{
			System.out.println("somthing wrong");
		}
	}
	else
	{
		System.out.println("con not use database");
	}
	
	}

}
