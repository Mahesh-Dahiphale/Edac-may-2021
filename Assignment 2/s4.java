class s4
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}