package demoPackage;

public class demoApp {

	public static void main(String[] args) 
	{
		Object obj[]=new Object[5];
		obj[0] = 100;
		obj[1] = 200;
		obj[2] = "good";
		obj[3] = new java.util.Date();
		obj[4]="BHArath";
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		
	}

}
