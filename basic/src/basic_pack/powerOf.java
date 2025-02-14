package basic_pack;
class check
{
	public String getResult(int no)
	{
		
		 while(no%2==0)
		 {
			 no=no/2;
		 }
		if(no==1)
		{
			return "true";
		}
		else
		{
			return "false";
		}
		
	}
}

public class powerOf {
	public static void main (String arg[]) {
		int no=32;
		check kk=new check();
		System.out.println(kk.getResult(no));
		
				
	}

}
