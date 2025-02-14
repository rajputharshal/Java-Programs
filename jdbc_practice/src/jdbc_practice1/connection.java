package jdbc_practice1;
import java.sql.*;
public class connection {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			System.out.println("connected");
		}
		else
		{
		System.out.println("not");
		}
	}

}
