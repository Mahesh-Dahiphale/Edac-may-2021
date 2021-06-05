class s10
{
	public static void main(String args[])
	{
		int i,j,k,z=5;
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=z-1;k++)
			{
				System.out.print("*");
				
			}
			//z+=2;
			System.out.println(" ");
			
		}
	}
}