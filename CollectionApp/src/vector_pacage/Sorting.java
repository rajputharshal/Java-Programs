package vector_pacage;
import java.util.*;
public class Sorting {
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(40);
		v.add(10);
		
		
		for(int i=0; i<v.size();i++) {
			for(int j=(i+1);j<v.size();j++) 

			{
				Object prev=v.get(i);
				Object next=v.get(j);

				if((int)prev >(int)next) 
				{
					v.set(i,next);
					v.set(j,prev);
				}
			}
		}
		System.out.println(v);
	}

}
