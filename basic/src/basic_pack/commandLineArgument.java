package basic_pack;

public class commandLineArgument {
	public static void main(String[] x)
	{
	
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.println(a  +" "+  b);


		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a  +" "+  b);
	}
	
}
