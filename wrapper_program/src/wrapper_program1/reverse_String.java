package wrapper_program1;

public class reverse_String {
	public static void main(String arg[])
	{
		String str="java";
		char ch[]=str.toCharArray();
		
		int end=str.length(),start;
		int len=str.length()/2;
		
		for(start=0;start<len;start++)
		{
			--end;
			System.out.println(start);
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			
			System.out.println(end);

		}
		System.out.println(ch);
	}

}
