package vector_pacage;
import java.util.*;
public class maxValue {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(354);
		v.add(453);
		v.add(3450);	
		v.add(7550);
		v.add(540);
		int max=(int)v.get(0);
		for(int i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			if((int)ob>max)
			{
				max=(int)ob;
			}
		}
		System.out.println(max);
	}

}
