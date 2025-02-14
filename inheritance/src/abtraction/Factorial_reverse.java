/* Write a Program to create Num as abstract class with two methods 
void setValue(int x): this is non abstract method in abstract class
abstract int getResult(): this is abstract method and return result different from every child
and we have two child classes one is Factorial and one is Reverse we have to inherit Num class in Factorial 
and Reverse and override getResult() method and in Factorial class we have to calculate factorial of number 
and return it and in Reverse class we have to inherit Num class and reverse number and return it.
*/

package abtraction;
abstract class Num
{
	int i=1,x;
	void setValue(int x)
	{
		this.x=x;
	}
	abstract int result();
}
class factorial extends Num
{
	int sum=1;
	int result()
	{
		
		while(i<=x)
		{
			sum*=i;
			i++;
		}
		return sum;
	}
}
public class Factorial_reverse {

	public static void main(String[] args) 
	{
		System.out.println("hello");
		factorial f=new factorial();
		f.setValue(5);
		
		System.out.println("==========="+f.result());
	}
}
