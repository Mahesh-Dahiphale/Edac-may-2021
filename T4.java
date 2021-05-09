import java.util.Scanner;
class T4
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to check");
n=sc.nextInt();
if(n % 2==0)
{
System.out.println("the given number "+n+" is Even");
}
else
System.out.println("the given number "+n+" is Odd");
}
}