class s5
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>i;j--)
			{
				if(j>i)
				{
				System.out.print(" ");}
				else
				{
					System.out.print(" *");
				}
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
}