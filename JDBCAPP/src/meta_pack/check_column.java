package meta_pack;
import java.sql.*;
import java.util.*;
public class check_column {
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			System.out.println("connected");
			PreparedStatement pst=con.prepareStatement("select * from employee");
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int clm=rsmd.getColumnCount();
			//System.out.println("total column="+ clm);
			for(int i=1;i<=clm;i++)
			{
				String type=rsmd.getColumnTypeName(i);
				int size=rsmd.getColumnDisplaySize(i);
//				System.out.println(type   +"  "+  size);
				System.out.println(rsmd.getColumnName(i)+"\t"+ type+"("+size+")");
			}
		}
		else
		{
			System.out.println("not connected");
		}
	}

}
