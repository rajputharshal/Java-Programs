package file_pack;
import java.io.*;
import java.util.Scanner;
public class FileWriteApp {

	public static void main(String[] args) throws Exception
	{
		
			try
			{
				FileWriter  fw=new FileWriter ("D://mydrive.txt",true);
				Scanner sc=new Scanner(System.in);
				String st=sc.nextLine();
				fw.write(""+st);
				fw.close();
				System.out.println("done......");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
	}

}
