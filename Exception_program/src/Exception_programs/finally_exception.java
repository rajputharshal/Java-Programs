package Exception_programs;

public class finally_exception {

	public static void main(String[] args) {
		
		try 
		{
			int a,b,c;
			a=4;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception ex) {
			 System.out.println("error is "+ex);
		 }

		 finally
		 {}
	}

}
