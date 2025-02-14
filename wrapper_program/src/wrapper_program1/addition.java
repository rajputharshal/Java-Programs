package wrapper_program1;

public class addition {

	public static void main(String[] args)
	{
		String s="f45n345jn3";
		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch>=48 && ch<=57)
//			{
//				sum+=((int)ch)-48;
//			}
//		}
//		System.out.println(sum);
//	}
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				//System.out.println(ch[i]);
				sum+=ch[i]-48;
			}
			
		}
		System.out.println(sum);
	}
}
