package basic_pack;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				count+=i;
			}
		}
		//xSystem.out.println(count);
		if(no==count)
		{
			System.out.println("no is perfect");
		}
		else
		{
			System.out.println("no is not perfct");
		}
		
	}

}
