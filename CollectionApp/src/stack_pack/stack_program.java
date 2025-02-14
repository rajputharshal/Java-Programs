package stack_pack;
import java.util.*;
import java.util.Stack;

public class stack_program {

	public static void main(String[] args) 
	{
		Stack sk=new Stack();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("enter choise");
			int cs=sc.nextInt();
			switch(cs)
			{
			case 1:
				System.out.println("enter element");
				int no=sc.nextInt();
				sk.push(no);
				break;
			case 2:
				 System.out.println("Stack elements:");
                 ListIterator<Integer> li = sk.listIterator(sk.size());
                 while (li.hasPrevious()) {
                     System.out.println(li.previous());
                 }
                 break;
             case 3:
                 System.out.println("Exiting program.");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }while(true);
		
		}
}
