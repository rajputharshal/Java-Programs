package basic_pack;

import java.util.*;

public class PracticeClass {
	public static void main(String arg[]) {
//		int no;
//		String name;
//		Scanner sc=new Scanner (System.in);
//		no=sc.nextInt();
//		name=sc.next();
		
		//fahrenheit to celsius
//		int temp;
//		System.out.println("Enter temparature");
//		Scanner sc=new Scanner(System.in);
//		temp=sc.nextInt();
//		float result=((temp-32)*5)/9;
//		System.out.print("celsius is " + result);
		
		//swap number 
//		int a=4;
//		int b=6;
//		int c = 0;
//		System.out.println("A="+a +"	B="+b);
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("A="+a +"	B="+b);
		
		// swap without third variable  
		
//		int a=4;
//		int b=8;
//		b= a+b;
		
		
//		int a;
//		int b;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a and b\n");
//		a=sc.nextInt();
//		b=sc.nextInt();
//		
//		if(a>b)
//		{
//			System.out.print(" a is great"+a);
//		}
//		else
//		{
//			System.out.print(" b is great"+b);
//		}
		
		
		// check charector or number 
		
//		Scanner sc=new Scanner(System.in);
//		char ch=sc.next().charAt(0);
//		if(ch>=97&& ch<=122 || ch>=65 && ch<=90)
//		{
//			System.out.println( ch +" is charector");
//		}
//		else if(ch>=48&& ch<=57 )
//		{
//			System.out.println( ch +" is Number ");
//		}
//		else {
//			System.out.println("invalid");
//		}
		
		//prime or not
//		Scanner sc=new Scanner(System.in);
//		int no=sc.nextInt();
//		int count=0;
//		int i=2;
//		while(i<no)
//		{
//			if(no%i==0)
//			{
//				count++;
//			}
//			i++;
//		}
//		if(count>0)
//		{
//			System.out.println("not a prime number");
//		}
//		else
//		{
//			System.out.println(" prime number");
//		}
		
//		for(int i=1;i<=no;i++)
//		{
//			if(no%i==0)
//			{
//				count++;
//			}
//				
//		}
//		if(count==2)
//		{
//			System.out.println(" prime number ");
//		}
//		else {
//			System.out.println("not a  prime");
//		}
		
		//find zero 
//		int no=344;
//		int count=0;
//		while(no!=0)
//		{
//			int rem=no%10;
//			if(rem==0)
//			{
//				 count++;
//				break;
//			}
//			no=no/10;
//		}
//		if(count>0)
//		{
//			System.out.println("in thise no 0 is here");
//		}
//		else {
//			System.out.println("in thise no 0 is not here");
//		}
		
		//factorial number 
		// 1 2 3 4 =24
		
		int fact=5;
		int no=1;
		for(int i=1;i<=fact;i++)
		{
			no*=i;
		}
System.out.println(no);
		
	}
}
