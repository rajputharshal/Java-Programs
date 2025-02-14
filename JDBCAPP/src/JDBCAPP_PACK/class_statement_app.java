package JDBCAPP_PACK;
import java.sql.*;
import java.util.Scanner;
public class class_statement_app {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Scanner sc=new Scanner(System.in);
		String name,email,contact;
		
		
		System.out.println("1 enter");
		System.out.println("2 show");
		int no =sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		Statement stm=con.createStatement();
		switch(no)
		{
			case 1:
				System.out.println("ent4er name");
				name=sc.next();
				System.out.println("email");
				email=sc.next();
				System.out.println("contact");
				contact=sc.next();
				int val=stm.executeUpdate("insert into jj values('"+name+"','"+email+"','"+contact+"')");
				if(val>0)
				{
					System.out.println("succesfull");
				}
				else
				{
					System.out.println("sorry somthing else");
				}
			break;
			case 2:
				ResultSet rs=stm.executeQuery("select * from jj");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"  " + rs.getString(2)+"  " + rs.getString(3));
				}
			break;
			
				
			
		}
		
	}

}
