package abtraction;
abstract class ArrayTest
{
	int a[];
	void setarray(int a[])
	{
		this.a=a;
	}
	abstract int result();
}
class sum extends ArrayTest
{
	int result()
	{
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
class max extends ArrayTest
{
	int result()
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
}
public class max_sum {
	public static void main(String[] args)
	{
		//int a[]=new int[5];
		int a[]= {10,5,6,3,5};
		sum s=new sum();
		s.setarray(a);
		System.out.println(s.result());
		max m=new max();
		m.setarray(a);
		System.out.println(m.result());
	}

}
