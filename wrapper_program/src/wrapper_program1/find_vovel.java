package wrapper_program1;

public class find_vovel 
{
	public static void main(String arg[])
	{
		String str="He 111y11111s";
		char ch[]=str.toCharArray();
		int i,sum = 0 ,count=0;
		int len =ch.length;
	
		for(i=0;i<str.length();i++)
		{
			
			if(ch[i]>=48 && ch[i]<=57)
			{
				sum=sum +((int)ch[i]-48);
			}

		}
		System.out.println(sum);
	}
}
