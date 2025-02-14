package basic_pack;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no,rem,sum=0;
		System.out.println("enter number");
		no=sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			sum=sum*10+rem;
		}
		System.out.println(sum);
	}

}
