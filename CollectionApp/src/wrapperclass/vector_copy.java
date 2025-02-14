package wrapperclass;
import java.util.ArrayList;
import java.util.Vector;
public class vector_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(30);
		a.add(59);
		System.out.println(a);
		Vector v=new Vector(a);
		System.out.println(v);
		
	}

}
