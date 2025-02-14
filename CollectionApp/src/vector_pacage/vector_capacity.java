package vector_pacage;
import java.util.*;
public class vector_capacity {
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(3);
		int size=v.capacity();
		System.out.println(size + " "+v.size());
	}
}
