package Wrapper_pack;
public class skipString {
	public static void main(String adg[])
	{
		String s="hello java good night jaa";
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]);
			if(st[i].endsWith("a"))
			{
				System.out.println("end="+st[i]);
			}
			
		}
		String s3=s.toUpperCase();
		System.out.println(s3);
	}
}
