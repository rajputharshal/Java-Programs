package wrapper_program1;

public class DeleteOccurance {

	public static void main(String[] args) {
		String str="aabdjfhd kjsdhfidhg sdfjhjasodnvd";
		String r = "";
//		for(int i=0;i<str.length();i++)
//		{
//			String s=""+str.charAt(i);
//			if(r.contains(s))
//			{
//				continue;
//			}
//			r+=s;
//		}
//		System.out.println(r);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(r.indexOf(ch)==-1)
			{
				r+=ch;
			}
		}
		System.out.println(r);
	}

}
