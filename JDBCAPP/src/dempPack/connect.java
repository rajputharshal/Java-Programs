package dempPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class connect {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		//System.out.println("done");
		Scanner sc=new Scanner(System.in);

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");		
		if(c!=null)
		{
			System.out.println("connected");
			Statement stm=c.createStatement();
//			int id=sc.nextInt();
//			String name=sc.next();
//			String email=sc.next();
//			int val=stm.executeUpdate("insert into student value('"+id+"','"+name+"','"+email+"')");
//			if(val>0)
//			{
//				System.out.println("done");
//			}
//			else
//			{
//				System.out.println("faild");
//			}
			ResultSet rst=stm.executeQuery("select * from student");
			while(rst.next())
			{
				System.out.println(rst.getInt(1) + rst.getString(2));
			}
		}
		else
		{
			System.out.println("faild");
		}
	}

}
