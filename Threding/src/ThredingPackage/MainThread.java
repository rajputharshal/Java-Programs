package ThredingPackage;

public class MainThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		String s=t.getName();
		System.out.println(s);
		int pri=t.getPriority();
		System.out.println(pri);
	}

}
