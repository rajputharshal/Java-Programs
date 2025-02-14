package basic_pack;
import java.util.*;
public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int no=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
	}

}
