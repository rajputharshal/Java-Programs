package Exception_programs;

public class throwException {
	public static void demo(int x) 
	{
		if(x>18)
		{
			System.out.println("it is valid age");
		}
		else
		{
			throw new ArithmeticException("not valid age");		}
		
	}
	public static void main (String arg[])
	{
		demo(11);
	}

}
