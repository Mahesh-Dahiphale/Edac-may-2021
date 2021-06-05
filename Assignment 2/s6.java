class s6
{
	public static void main(String args[])
	{
		int i,j;
		for(i=4;i>=1;i--)
		{
				for(int k=1;k<=(i*2)-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
				for(j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
		}
		
		
	}
}