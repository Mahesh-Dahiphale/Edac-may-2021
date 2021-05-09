import java.util.*;
class T6
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int max=a[0];
	for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("maximum no is : "+max);
	}
}