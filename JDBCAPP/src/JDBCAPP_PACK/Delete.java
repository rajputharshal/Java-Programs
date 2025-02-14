package JDBCAPP_PACK;
import java.sql.*;
import java.util.*;
public class Delete {
	public static void main(String arg[]) throws Exception
	{
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");		if(con!=null)
		if(con!=null){
			Scanner sc=new Scanner(System.in);
			Statement stm=con.createStatement();
			System.out.println("enter id");
			int id=sc.nextInt();
			int val=stm.executeUpdate("delete from employee where id='"+id+"'");
			if(val>0)
			{
				System.out.println("value remove succesful");
			}
			else
			{
				System.out.println("somthing wrong");
			}
		}
		else
		{
			System.out.println("cannot connect");
		}
	
	}
}
