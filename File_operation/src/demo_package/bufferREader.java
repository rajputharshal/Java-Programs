package demo_package;
import java.io.*;
public class bufferREader {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("D:\\FileHandlingHarsh");
		BufferedReader bf=new BufferedReader(f);
		String data;
		while((data=bf.readLine())!=null)
		{
			System.out.println(data);
		}

	}

}
