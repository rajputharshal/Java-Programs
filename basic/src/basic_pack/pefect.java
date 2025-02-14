package basic_pack;

public class pefect {

	public static void main(String[] args)
	{
		int no,i;
		
		for(no=1;no<=100;no++)
		{
			int sum =0;
			
			for(i=1;i<no;i++)
			{
				if(no%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==no)
			{
				System.out.println(no);
			}
		}
		
	}

}
