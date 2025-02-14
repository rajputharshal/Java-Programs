package demoPackage;
import java.util.*;
public class copyColection {

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
			ar.add(100);
			ar.add(300);
			ar.add(800);
			
		Vector v=new Vector(ar);
		System.out.println("="+v);
	}

}
