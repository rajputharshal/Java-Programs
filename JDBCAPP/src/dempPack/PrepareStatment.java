package dempPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PrepareStatment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Scanner xyz = new Scanner(System.in);
		 	System.out.println("Enter name email and contact");
//		 	int id =xyz.nextInt();
//		 	String name=xyz.next();
//		 	String email=xyz.next();
//		 	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
//		 	ps.setInt(1, id);
//		 	ps.setString(2, name);
//		 	ps.setString(3, email);
//		 	int val=ps.executeUpdate();
//		 	if(val>0)
//		 	{
//		 		System.out.println("added");
//		 	}
//		 	else
//		 	{
//		 		System.out.println("faild");
//		 	}
		 	PreparedStatement ps=con.prepareStatement("select * from student");
		 	ResultSet r=ps.executeQuery();
		 	while(r.next())
		 	{
		 		System.out.println(r.getInt(1)+ r.getString(2));
		 	}
		}
		else
		{
			System.out.println("faild");
		}

	}

}
