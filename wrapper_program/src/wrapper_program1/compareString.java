package wrapper_program1;

public class compareString {
	public static void main(String arg[])
	{
		String s=new String("hello");
		String s1="hello";
		int i=s.compareTo(s1);
		if(i==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal"+i);
		}
	}

}
