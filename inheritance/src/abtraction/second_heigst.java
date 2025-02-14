
/*Write a program to find second highest element from array without sorting?

Your Task : you have to create abstract class name as ArrayParent with one non abstract method and one 
abstract method 
void setArray(int a[]): this is non abstract method 
public abstract int getSecondHigesth(): it is abstract  method and we have one class name as 
FindSecondHighest and we have to inherit ArrayParent class in FindSecondHighest and override its getSecondHighest() method and return second highest value of array
*/
package abtraction;
abstract class array
{
	int a[],no;
	void setArray(int a[],int no)
	{
		this.a=a;
		this.no=no;
	}
	 abstract int get2nd();
}

class find2nd extends array
{
	int get2nd()
	{
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		int result=a[no-1];
		return result;
	}
}
public class second_heigst {
	public static void main(String[] args) 
	{
		int a[]= {10,75,76,55,54};
		find2nd f=new find2nd();
		f.setArray(a,2);
		System.out.println(f.get2nd());
	}

}
