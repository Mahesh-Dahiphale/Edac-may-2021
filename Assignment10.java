/*10.Write a java program to compute a specific formula.
4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)) */
import java.lang.*;
class Assignment10
{
	public static void main(String args[])
	{
		float a=4.0F;
		float b=1.0F;
		int c=1;
		int d=3;
		int e=5;
		int f=7;
		int g=9;
		int h=11;
		
		System.out.println("Expected output is ="+(a*(c-(b/d)+(b+e)-(b+f)+(b/g)-(b/h))));
		
	}
}
