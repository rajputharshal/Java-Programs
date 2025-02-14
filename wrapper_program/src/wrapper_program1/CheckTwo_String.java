package wrapper_program1;

public class CheckTwo_String {
	private Object ch;

	public static void main(String arg[])
	{
		String s1="hello java";
		String s2="hello java";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int i;
		boolean flag=false;
		if(ch1.length==ch2.length)
		{
			for(i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}
		else
		{
			System.out.println("length is not same");
		}
//		int result=s2.compareTo(s1);
//		System.out.println(result);
//		if(result!=1)
//		{
//			System.out.println("same");
//		}
//		else
//		{
//			System.out.println("not same");
//		}
		
		
	}
}
