package constructor;
/*WAP to create class name as CheckPalimdrome with two constructor 
   CheckPalimdrome(int a[]): accept integer type of array and check array is palimdrome or not 
Input  :  10 20 30 20 10  - this is palimdrome array
  CheckPalimdrome(char[]): accept character array type of data and check it is palindrome or not 
Input  abcba – it is palimdrome 
boolean checkIntPalim(): this method check integer array is palimdrome or not if then return true otherwise 
return false.
boolean checkCharPalim(): this method check character array is palimdrome or not if then return true 
otherwise return false.
*/
class palindrom
{
	int []a;
	palindrom(int a[])
	{
		this.a=a;
	}
	boolean checkInt()
	{
		int i,j=0;
		int b[]=new int[a.length];
		for(i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			++j;
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				return true;
			}
			else
			{
					return false;
			}
		}
		return false;
		
	}
}
public class palindrom_number {

	public static void main(String[] args) {
	int a[]= {1,2,1};
	
	palindrom p=new palindrom(a);
	if(p.checkInt())
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("not");
	}
	}

}
