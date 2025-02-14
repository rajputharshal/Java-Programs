package reader_pack;
import java.io.*;
public class readData {

	public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("D://mydrive.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			System.out.print(ch);
		}
		
	}

}
