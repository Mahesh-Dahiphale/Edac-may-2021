/*5.Write a java program that takes two number as input and display the product of two number*/
import java.util.Scanner;
public class Assignment5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println(+a+"*"+b+"="+c);
	}
}
