package jdbc_practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class prepareStatementDelete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			PreparedStatement stm=con.prepareStatement("delete from stud where id=?");
			int id=3;
			stm.setInt(1, id);
			int value=stm.executeUpdate();
			if(value>0)
			{
				System.out.println("done");
			}
			else
			{
				System.out.println("somthing wrong");
			}
		}
		else
		{
			System.out.println("not connected");
		}
	}

}
