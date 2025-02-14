package Wrapper_pack;

public class bufferReader {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("good morning pune");
		System.out.println(sb);
		sb.append(2220);
		System.out.println(sb);
		sb.insert(5, "or bad");
		System.out.println(sb);
		sb.delete(12, sb.length());
		System.out.println(sb);


	}

}
/*Before Append Good Morning india  
After append Good Morning india  2023
After insert Good Morning  welcome india  2023
Delete Data Good   welcome india  2023*/