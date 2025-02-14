package patterns.copy;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((j>=5-i&&j<=3+i)||(j<=9-i && i>5))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}


		
	}

}
