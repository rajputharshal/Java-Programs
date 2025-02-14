package demo_package;

import java.io.*;
import java.util.Scanner;


public class writedataIntoThefile {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		FileWriter f=new FileWriter("D:\\FileHandlingHarsh",true);
		String data=sc.nextLine();
		f.write(data);
		f.close();
	}

}
