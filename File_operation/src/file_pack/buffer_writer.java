package file_pack;

import java.io.*;
import java.util.*;
public class buffer_writer {
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
			FileWriter fw=new  FileWriter("D://mydrive.txt",true);
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(str);
			bf.newLine();
			bf.close();
			fw.close();
			System.out.println("success...............");
		}
		
		
	

}
