package csv_pack;
import java.sql.*;
import java.util.*;
import java.io.*;
public class insert {
	public static void main(String[] args) throws Exception
	{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			FileReader f=new FileReader("D:\\pp.csv");
			BufferedReader br=new BufferedReader(f);
			String str;
			int val;
			while((str=br.readLine())!=null)
			{
				String col[]=str.split(",");
				PreparedStatement pstm=con.prepareStatement("insert into employee values(0,?,?,?,?,?)");
				pstm.setString(1,col[0]);
				pstm.setString(2,col[1]);
				pstm.setString(3, col[2]);
				pstm.setString(4,col[3]);
				pstm.setString(5,col[4]);
				val=pstm.executeUpdate();
				if(val>0)
				{
					System.out.print("inserted");
				}
				else
				{
					System.out.print("faild");
				}
					
			}
			System.out.println("connected");
		}
		else
		{
			System.out.println("connected");
		}

	}

}
