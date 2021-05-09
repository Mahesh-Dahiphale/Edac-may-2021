import java.util.*;
class T5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enetr element : ");
			a[i]=sc.nextInt();
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		System.out.println("**************************");
		int b=a.length;int t;
		for(int i=0;i<a.length/2;i++)
		{
			t=a[i];
			a[i]=a[b-i-1];
			a[b-i-1]=t;
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}