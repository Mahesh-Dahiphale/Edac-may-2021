/*4. Write a java program to print the result of the following operation:
a.-5+8*6
b.(55+9)%9
c.20+3*5/8
d.5+15/3*2-8%3
*/
class Assignment4
{
	public static void main(String args[])
	{
		int a=5,b=8,c=6,d=55,e=9,f=20,g=3,h=15,i=2,ans;
		ans=-a+b*c;
		System.out.println(ans);
		ans = (d+e)%e;
		System.out.println(ans);
		ans=f+(-g)*a/b;
		System.out.println(ans);
		ans=a+h/g*i-b%g;
		System.out.println(ans);
		
	}
}
