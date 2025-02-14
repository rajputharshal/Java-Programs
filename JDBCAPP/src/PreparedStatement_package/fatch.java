package PreparedStatement_package;
import java.sql.*;
public class fatch {

	public static void main(String[] args) throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			PreparedStatement p=con.prepareStatement("select * from employee where id=1");
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +" \t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t\t"+rs.getString(4));
			}
		}else
		{
			System.out.println("not connected");
		}
	}
}
