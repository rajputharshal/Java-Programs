package wrapper_program;

public class String_buffer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("good morning India");
		System.out.println(sb);
		sb.append(2003);
		System.out.println(sb);
		sb.insert(8, "welcome");
		System.out.println(sb);
		sb.delete(8, 16);
		System.out.println(sb);
	}

}
