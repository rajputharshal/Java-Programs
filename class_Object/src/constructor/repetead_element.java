package constructor;
/*
 * WAP to create class  name as FindNonRepeatElement with parameterized constructor and one method 
 * void showNonRepeat()
FindNonRepeatElement(int arr[]): this constructor is used for accept array as parameter 
void showNonRepeat(): this method can show the non repeat parameter 
*/
class findNumber
{
	int a[];
	findNumber(int a[])
	{
		this.a=a;
	}
	void repetation()
	{
		int i,j;
		for(i=0;i<a.length;i++)
		{
			int count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					++count;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i] +"="+ count);
			}
		}
	}
}
public class repetead_element {
	public static void main(String arg[])
	{
		int a[]= {10,50,20,10,40,20,50,50};
		findNumber f=new findNumber(a);
		f.repetation();
	}

}
