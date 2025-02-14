package class_Object;
import java.util.*;
class reverse
{
	int a[];
	void set(int a[])
	{
		this.a=a;
	}
	int[] result()
	{
		int i,mid;
		mid=a.length/2;
		int len=a.length-1;
		for(i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[len];
			a[len]=temp;
			--len;
		}
		return a;
		
	}
}
public class reverse_array {

	public static void main(String[] args) {
		int i,a[]= {10,20,50,60,78};
		
		reverse r=new reverse();
		r.set(a);
		a=r.result();
		for(i=0;i<a.length;i++)
		{
			System.out.print(" = "+a[i]);
		}
	}

}
