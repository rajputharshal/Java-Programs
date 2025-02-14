package vector_pacage;
import java.util.*;
public class occurance {

	public static void main(String[] args) 
	{

		Vector ar=new Vector();
		ar.add(10);
		ar.add(20);
		ar.add(10);
		ar.add(50);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(10);

		int i,j,a[]=new int[ar.size()],count=0;
		for(i=0;i<ar.size();i++)
		{	count=1;
			for(j=i+1;j<ar.size();j++)
			{
				if(ar.get(i)==ar.get(j))
				{
					count++;
					ar.set(j,0);
				}
			}
			if((int)(ar.get(i))!=0)
			{
				System.out.println(ar.get(i) +"="+ count);
				int size=ar.size()/2;
				//find mejority
				if(size<=count)
				{
					System.out.println(ar.get(i)+"is mejority element");
				}
			}
		}
	}
}
