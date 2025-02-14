package jdbc_practice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class csvFile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
		if(con!=null)
		{
			FileReader fr=new FileReader("D:\\pp.csv");
			BufferedReader bf=new BufferedReader(fr);
			String line;
			while((line=bf.readLine())!=null)
			{
				String[] ch=line.split(",");
				PreparedStatement stm=con.prepareStatement("insert into stud values(?,?,?,?)");
				int id,contact;
				stm.setInt(1,id=Integer.parseInt(ch[0]));
				stm.setString(2, ch[1]);
				stm.setString(3, ch[2]);
				stm.setInt(4, contact=Integer.parseInt(ch[3]));
				
				int val=stm.executeUpdate();
				if(val>0)
				{
					System.out.println("done");
				}
				else
				{
					System.out.println("not");
				}
			
			}
		}
		
	}

}
