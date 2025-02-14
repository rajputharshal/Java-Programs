package basic_pack;

public class StrongNumber {

	public static void main(String[] args) {
		//sum of factorial
	
		for(int i=1;i<=200;i++)
		{
			long fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			
			long no=fact;
		
			long sum = 0;
			while(no!=0)
			{
				long rem=no%10;
				sum=sum+rem;
				no=no/10;	
			}
			
			if(sum==fact &&sum!=0)
			{
				System.out.println(sum +"no is Strong"+fact);
			}
			else
			{
				continue;
			}
		}
		
	}

}
