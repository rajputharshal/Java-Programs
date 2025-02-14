package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class StatementInsert {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Statement stm=con.createStatement();
			//int val=stm.executeUpdate("insert into stud values('2','harsh','h123','976550');");
			//using injection
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			int contact=sc.nextInt(); 
			int val=stm.executeUpdate("insert into stud values('"+id+"','"+name+"','"+email+"','"+contact+"')");
			if(val>0)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("not inserted");
			}
		}
		else
		{
			System.out.println("not connected");
		}
		
	}

}
