package wrapper_program1;

public class AutoUnboxing {

	public static void main(String[] args) {

//		int a=100;
//		Integer i=a;
//		System.out.println(i); 
//		Integer no=345;
//		int n=no;
//		System.out.println(n);
//		Float f=34.34f;
//		n=f.intValue();
//		System.out.println(n);
//		
//		String s=String.valueOf(a);
//		System.out.println("dfng"+n);
//		no=a;
//		System.out.println(no);
//		 Float c=Float.valueOf(a); //convert integer primitive to type float reference
//		 System.out.println("C is "+c);
//		Integer i=12000;
//		String s=i.toString();
//		System.out.println(s);
		
		
		String s=new String ("hii");
		String ss=new String("hiii");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(ss));
		
	}

}
