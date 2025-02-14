package Exception_programs;

public class catch_exception {
	public static void main(String arg[])
	{
		try {
			int a,b,c;
			a=4;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
	}

}
