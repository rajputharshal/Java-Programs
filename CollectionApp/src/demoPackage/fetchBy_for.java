package demoPackage;
import java.util.*;
public class fetchBy_for {
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(344);
		v.add(4532);
		v.add(4234);
		v.add(3435);
		for(int i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			System.out.println(ob);
		}
	}

}
