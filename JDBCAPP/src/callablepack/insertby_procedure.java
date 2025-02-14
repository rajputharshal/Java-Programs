package callablepack;
import java.sql.*;
import java.util.*;
public class insertby_procedure {
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			Scanner sc=new Scanner(System.in);
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
			  CallableStatement cst=con.prepareCall("{call proemp(0,?,?,?,?,?)}");			cst.setString(1,name);
			cst.setString(2,email);
			cst.setString(3,contact);
			cst.setInt(4, sal);
			cst.setInt(5,did);
			boolean b=cst.execute();
			if(!b)
			{
				System.out.println("data enterd");
			}
			else
			{
				System.out.println("data not enterd");
			}
			
		}
		else
		{
			System.out.println("not conected");
		}
	}

}
