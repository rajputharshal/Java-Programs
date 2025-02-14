package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class statementsearch {
	public static void main(String arg[]) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			int id=1;
			Statement stm=con.createStatement();
			 ResultSet rs=stm.executeQuery("select * from stud where id='"+id+"'");
			 if(rs.next())
			 {
				 System.out.println(rs.getString("name"));
			 }
			
		}
	}

}
