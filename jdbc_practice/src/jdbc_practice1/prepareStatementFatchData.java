package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class prepareStatementFatchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			PreparedStatement stm=con.prepareStatement("select * from stud");
			ResultSet rs=stm.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("id") + rs.getString("name"));
			}
		}
		else
		{
			System.out.println("not connected");
		}
	}

}
