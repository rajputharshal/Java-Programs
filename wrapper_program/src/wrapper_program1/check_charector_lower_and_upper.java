package wrapper_program1;

public class check_charector_lower_and_upper {

	public static void main(String[] args) 
	{
		String str="helASDlo";
		char ch[]=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.println(ch[i]+"   lower case char");
			}
			else if(ch[i]>='A'&& ch[i]<'Z')
			{
				System.out.println(ch[i]+"  upper case char");
			}
			else
			{
				System.out.println("  number");
			}
		}
	}

}
