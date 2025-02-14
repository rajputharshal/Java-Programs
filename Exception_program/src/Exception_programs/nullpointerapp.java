package Exception_programs;

public class nullpointerapp {
	static int a[];//null
	public static void main(String[] args) {
		
		
		   try {
			  a[0]=100;
			  System.out.println(a[0]);
		   }
		   catch(NullPointerException ex) {
			   System.out.println("Error is "+ex);
		   }
		
}

}
