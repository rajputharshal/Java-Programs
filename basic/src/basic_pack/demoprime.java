package basic_pack;

public class demoprime {

	public static void main(String[] args) {
		int count=0,no=5;
		boolean b=false;
		int i=2;
		while(i<no)
		{
			if(no%i==0)
			{
				b=true;
				break;
			}
			i++;
		}
		if(b)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println(" prime");
		}
	}

}
