package JDBCAPP_PACK;
import java.sql.*;
import java.util.*;
public class insert_employee {
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int id,sal,did; 
		String name,email,contact;
		System.out.println("enter id of employee");
		id=sc.nextInt();
		System.out.println("enter name of employee");
		name=sc.next();
		System.out.println("enter email of employee");
		email=sc.next();
		System.out.println("enter contact of employee");
		contact=sc.next();
		System.out.println("enter salary of employee");
		sal=sc.nextInt();
		System.out.println("enter department id of employee");
		did=sc.nextInt();
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Statement stm=con.createStatement();
		int val=stm.executeUpdate("insert into employee values('"+id+"','"+name+"','"+email+"','"+contact+"','"+sal+"','"+did+"')");
		if(val>0)
		{
			System.out.println("enter sucessful");
		}
		else
		{
			System.out.println("bhai na chagel");
		}
	}

}
