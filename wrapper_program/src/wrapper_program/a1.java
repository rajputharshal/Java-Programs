package wrapper_program;

public class a1 {
	static int x;
	static Integer z;
	public static void main(String arg[])
	{
		System.out.println(x +"and"+z);
		//value of method
		int a=435;
		String s=String.valueOf(a);
		Float f=Float.valueOf(s);
		System.out.println(s   + f);
		
		Integer i=345;
		String q=String.valueOf(i);
		String v=i.toString();
		System.out.println("String="+q  + v);
		
	}

}
