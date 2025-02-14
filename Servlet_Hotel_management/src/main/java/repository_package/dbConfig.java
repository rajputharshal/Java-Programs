package repository_package;
import java.sql.*;
public class dbConfig 
{
	
	protected PreparedStatement pstm;
	protected ResultSet rs;
	protected Connection con;
	public dbConfig()
	{
		try
		{
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagment","root","12345");
		}
		catch(Exception ex)
		{
			
		}
				
	}

}
