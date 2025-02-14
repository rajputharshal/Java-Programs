package vector_pacage;

import java.util.*;

public class Iterato_Fatch 
{
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(43);
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Object ob=it.next();
			if((int)ob==50)
			{
				it.remove();
			}
			
		}
		System.out.println(v);
	}
}
