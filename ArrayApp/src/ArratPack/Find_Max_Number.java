package ArratPack;

public class Find_Max_Number {
	public static void main(String arg[]) {
		int a[]= {2,4,5,7,8,11};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Max Number is "+max);
			
	}
}
