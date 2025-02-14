package JDBCAPP_PACK;
import java.sql.*;
public class insertApp {
	public static void main(String arg[])throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		
		if(con!=null)
		{
			System.out.println("succsesfull");
			Statement stm=con.createStatement();
			int val=stm.executeUpdate("insert into employee values(1,'ganesh',700000,'ganesh123'),(2,'sagar',400000,'sagar123')");
			if(val>0)
			{
				System.out.println("value enter succed");
			}
			else
			{
				System.out.println("values not insert");
			}
		}
		else
		{
			System.out.println("somthing wrong");
		}
	}

}
