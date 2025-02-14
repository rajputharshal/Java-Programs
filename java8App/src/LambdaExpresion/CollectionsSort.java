package LambdaExpresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyClass implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b) {
		return b-a;
	}
	
}
public class CollectionsSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(456);
        list.add(346);
        list.add(22);
        System.out.println("Original list: " + list);

        // Sort in ascending order
        Collections.sort(list, (a, b) -> a - b);
        System.out.println("List sorted in ascending order: " + list);

        // Sort in descending order
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("List sorted in descending order: " + list);

        Collections.sort(list,new MyClass());//using comaparabble class
        System.out.println("List sorted in descending order using comparator class: " + list);
    
    }
}