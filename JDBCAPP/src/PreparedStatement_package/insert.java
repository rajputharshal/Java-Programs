package PreparedStatement_package;
import java.util.*;
import java.sql.*;
public class insert {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			int id,sal,did;
			String name,email,contact;
//			System.out.println("id");
//			id=sc.nextInt();
			System.out.println("name");
			name=sc.next();
			System.out.println("email");
			email=sc.next();
			System.out.println("contact");
			contact=sc.next();
			System.out.println("salary");
			sal=sc.nextInt();
			System.out.println("did");
			did=sc.nextInt();
			
			PreparedStatement pstm=con.prepareStatement("insert into employee values(0,?,?,?,?,?)");
		
			pstm.setString(1,name);
			pstm.setString(2,email);
			pstm.setString(3, contact);
			pstm.setInt(4,sal);
			pstm.setInt(5,did);
			int value=pstm.executeUpdate();
			if(value>0)
			{
				System.out.println("pass succesful");
			}
			else {
				System.out.println("not succesful");
			}
			
			
		}
		else
		{
			System.out.println("connection get failed");
		}
	}
}
