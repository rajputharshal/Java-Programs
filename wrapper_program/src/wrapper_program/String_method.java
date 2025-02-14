package wrapper_program;

public class String_method {

	public static void main(String[] args) {
		String s="         hello im am from nundurbar and you are";
		String a="pune";
		//concat method isdinf add two string in new String
		String d=s.concat(a);
		System.out.println(d);
		
		//trim(); use for remove the space
		String s1=a.trim();
		System.out.println(s1);
		//insexOf()use for search data inString
		int i=s.indexOf("from");
		if(i!=-1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		
		//String subString use for print specific index	
		String data=s.substring(16,s.length());
		System.out.println(data);
		
		//String split 
		String []sp=s.split(" ");
		for(int i1 =0;i1<sp.length;i1++)
		{
			System.out.println(sp[i1]);
		}
		//endsWith
		String word[]=s.split(" ");
		for(int j=0;j<word.length;j++)
		{
			if(word[j].endsWith("r"))
			{
				System.out.println("==="+word[j]);
			}
			
		}
		a=s.toUpperCase();
		System.out.println("upper="+a);
		String cp="hello";
		String gp="hell0";
		int a1=cp.compareTo(gp);
		if(a1==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		if(cp.equals(gp))
		{
			System.out.println("equal code");
		}
		else
		{
			System.out.println("not equal code");
		}
	}

}
