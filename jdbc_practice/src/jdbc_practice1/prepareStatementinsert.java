package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prepareStatementinsert 
{
	public static void main(String arg[]) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Scanner sc=new Scanner(System.in);
		int id,contact;
		String name,email;
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		PreparedStatement stm=con.prepareStatement("insert into stud values(?,?,?,?)");
		System.out.println("id");
		stm.setInt(1,id=sc.nextInt());
		System.out.println("name");
		stm.setString(2,name=sc.next());
		System.out.println("email");
		stm.setString(3,email=sc.next());
		System.out.println("contact");
		stm.setInt(4,contact=sc.nextInt());
		int val=stm.executeUpdate();
		if(val>0)
		{
			System.out.println("inserted");
		}
		else
		{
			System.out.println("faild");
		}
		
	}
}
