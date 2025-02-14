package constructor;
/*Q1. WAP to create class name as  CheckPrime with parameterized constructor and one method name as  boolean
 *  checkPrime()
You have to input number from keyboard and pass to constructor as parameter and we have method name as 
boolean checkPrime(): this method can check number is prime or not if prime return true otherwise return false.
*/
class CheckPrime
{
	int no;
	 CheckPrime(int no)
	{
		this.no=no;
		System.out.println("no=="+no);
	}
	 boolean CheckPrime()
	 {
		 int i,count=0;
		 
		 for(i=1;i<=no;i++)
		 {
			 if(no%i==0)
			 {
				 ++count;
			 }
		 }
		 System.out.println("count"+count   + no);
		 if(count==2)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
		 
	 }
}
public class prime_number {

	public static void main(String[] args) 
	{
		CheckPrime c=new CheckPrime(5);
		if(c.CheckPrime()) {
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
