/*
 Write a program to input 3 x 3 matrixes and display upper triangular matrix

Input:  1  2 3 
        4 5 6
        7 8  9
Output:
    1  0  0
    4  5  0
    7  0  0
Your Task: you task is you have to create abstract class name as ArrayTest with two methods 
void setArray(int a[]): it is non abstract method 
int [][] getUpperTraingular(): this method can find upper triangular matrix and return it at function 
function and you have to upper triangular matrix at function calling point.

*/
package abtraction;
import java.util.*;
abstract class array1
{
	int a[][];
	void setArray(int[][] a)
	{
		this.a=a;
	}
	abstract int[][]getresult();
}
class upperlogic extends array1
{
	public int[][]getresult()
	{
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(j==0 || i==2)
				{
					System.out.println(a[i][j]);
				}
				else 
				{
					a[i][j]=0;
				}
					
			}
		}
		return a;
	}
}
public class upper_tranguler {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,size=sc.nextInt();
		int a[][]=new int[size][size];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		upperlogic u=new upperlogic();
		u.setArray(a);
		a=u.getresult();
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
	}

}
