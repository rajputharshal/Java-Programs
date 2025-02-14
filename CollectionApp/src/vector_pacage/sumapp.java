package vector_pacage;
import java.util.*;
public class sumapp {
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		int sum=0;
		for(int i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			sum+=(int)ob;
		}
		System.out.println(sum);
		
	}

}
