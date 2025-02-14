package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class statementFatchIndexing {
	public static void main(String arg[]) throws SQLException
	{
		 com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		 DriverManager.registerDriver(d);
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		 if(con!=null)
		 {
			 Statement stm=con.createStatement();
			 ResultSet rs=stm.executeQuery("select * from stud");
			 if(rs.next())
			 {
				 System.out.println(rs.getInt(1)+rs.getString(2));
			 }
		 }
		 else
		 {
			 System.out.println("not connected");
		 }
	}
}
