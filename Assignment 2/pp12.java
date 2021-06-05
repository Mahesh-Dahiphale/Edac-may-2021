class pp12
{
	public static void main(String args[])
	{
		int i ,j;
		
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(j<=i)
				{
				System.out.print(" ");}
				else
				{
					System.out.print(" "+j);
				}
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}