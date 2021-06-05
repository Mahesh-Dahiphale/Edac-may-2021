/*19.Write a java program to convert a decimal number to binary number.*/
import java.util.Scanner;
public class Assignment19
{
	public static void main(String args[])
	{
		int decimal,quot,i=1,j;
		int binary[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Decimal Number :");
		decimal=sc.nextInt();
		quot=decimal;
		while(quot!=0)
		{
			binary[i++]=quot%2;
			quot=quot/2;
		}
		System.out.println("Binary number is :");
		for(j=i-1;j>0;j--)
		{
			System.out.println(binary[j]);
		}
		System.out.println("\n");
	}
}
