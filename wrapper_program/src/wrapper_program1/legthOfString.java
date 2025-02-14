package wrapper_program1;

public class legthOfString {

	public static void main(String[] args) {
		String s="hello java";
		//System.out.println(s.length());
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=32)
			{
				++c;
			}
			
		}
		System.out.println(c);
		
	}

}
