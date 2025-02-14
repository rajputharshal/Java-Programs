package constructor;
class NumberConversion
{
	NumberConversion(int no)
	{
		int ind=0,rem=0;
		int dec[]=new int[40];
		while(no>0)
		{
			dec[ind++]=no%2;
			no=no/2;
		}
		
		for(int j=ind;j>=0;j--)
		{
			System.out.print(dec[j]);
		}
	}
	NumberConversion(int a[])
	{
		int len=a.length;
		int no=0,result = 0, mul=1;;
		for(int i=a.length-1;i>=0;i--)
		{
			result+=mul*a[i];//1 1
			System.out.println(a[i]+" "+ mul);
			mul*=2;	
			//System.out.println(result);
		}
		System.out.println(result);		
	}	
}
public class NumberConversionApp {

	public static void main(String[] args) {
		int a[]= {1,1,1,1};
		//NumberConversion np=new NumberConversion(15);
		NumberConversion np1=new NumberConversion(a);

	}

}
