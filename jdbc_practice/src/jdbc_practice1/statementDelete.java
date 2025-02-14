package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class statementDelete {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter deleting id");
			int id=sc.nextInt();
			Statement stm=con.createStatement();
			int val=stm.executeUpdate(" delete from stud where id ='"+id+"'");
			if(val>0)
			{
				System.out.println(id+"deleted");
			}
			else
			{
				System.out.println("somthing wrong");
			}
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
