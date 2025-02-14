package vector_pacage;
import java.util.*;
public class vectorShow {
	public static void main(String arg[]) throws InterruptedException
	{
		Vector v=new Vector();
		v.add(3000);
		v.add(2000);
		v.add(800);
		//System.out.println(v);
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Object ob=it.next();
			System.out.println(ob);
			Thread.sleep(1000);
		}
		
	}

}
