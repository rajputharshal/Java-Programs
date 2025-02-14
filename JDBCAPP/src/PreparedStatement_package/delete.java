package PreparedStatement_package;
import java.sql.*;
import java.util.*;
public class delete {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		PreparedStatement stm=con.prepareStatement("delete from employee where email=?");
		stm.setString(1,email);
		int val=stm.executeUpdate();
		String str=val>0 ? "record deleted":"ot deleted";
		System.out.println(str);
	}
}
