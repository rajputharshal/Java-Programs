package JDBCAPP_PACK;
import java.sql.*;
import java.util.*;
public class employee_delete {
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from employee where length(name)>3");
			System.out.println("name\temail \t        contact");
			while(rs.next()) 
			{
				
				System.out.println(rs.getString("name")+"\t" + rs.getString("email") +"\t"+ rs.getString("contact"));
			}
		}
		else
		{
			System.out.println("database not found");
		}
	}
}
