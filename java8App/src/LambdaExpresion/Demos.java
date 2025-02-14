package LambdaExpresion;
@FunctionalInterface
interface demoApp
{
	public String setData();
}
public class Demos {

	public static void main(String[] args) {
		demoApp d=()->"hello";
		System.out.println(d.setData());
		
	}

}
