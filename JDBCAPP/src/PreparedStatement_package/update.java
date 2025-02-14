package PreparedStatement_package;
import java.sql.*;
import java.util.*;
public class update {
	public static void main(String[] args)throws Exception 
	{
		String name= "suraj";
		String contact="565656444";
		int id=4;
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		PreparedStatement stm=con.prepareStatement("update employee set name=?,contact=? where id=?");
		stm.setString(1,name);
		stm.setString(2,contact);
		stm.setInt(3,id);
		int val=stm.executeUpdate();
		String str= val>0?"update":"not update";
		System.out.println(str);
	}
	

}
