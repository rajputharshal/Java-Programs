package basic_pack;
import java.util.*;
public class chechDigit {

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
		
		System.out.println(ch);
		if(ch>97 && ch<122)
		{
			System.out.println("its charecter");
		}
		else if(ch>48 && ch<57)
		{
			System.out.println("its digit");
		}
		else
		{
			System.out.println("it is symboll");
		}
	}

}
