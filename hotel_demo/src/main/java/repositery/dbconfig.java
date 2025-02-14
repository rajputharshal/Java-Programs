package repositery;
import java.sql.*;
public class dbconfig
{
	protected PreparedStatement pst;
	protected Connection con;
	protected ResultSet rs;
	public dbconfig()
	{
		try
		{
			com.mysql.cj.jdbc.Driver d =new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagment","root","12345");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
