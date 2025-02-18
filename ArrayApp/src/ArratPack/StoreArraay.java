package ArratPack;
import java.util.*;
public class StoreArraay {
	public static void main(String srg[])
	{
		int array[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter Number");
			array[i]=sc.nextInt();
		}
		System.out.println("Final result ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
