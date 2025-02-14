package Wrapper_pack;
import java.util.*;
import java.util.Scanner;
public class count_class {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(i+"  " + ch);
		}
	}

}
