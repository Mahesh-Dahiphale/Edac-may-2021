/*15. Write a java program to swap two variables. */
import java.util.Scanner;
class Assignment15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two character :");
		String s1=sc.next();
		String s2=sc.next();
		String temp;
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		
	}
}
