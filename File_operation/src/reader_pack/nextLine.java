package reader_pack;
import java.io.*;
public class nextLine {

	public static void main(String[] args)throws IOException, InterruptedException
	{
		FileReader fr=new FileReader("D://mydrive.txt");
		BufferedReader bf=new BufferedReader(fr);
		String data;
		while((data=bf.readLine()) != null)
		{
			System.out.println(data);
			Thread.sleep(100);
			
		}
	}

}
