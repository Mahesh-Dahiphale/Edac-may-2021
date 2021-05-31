import java.io.*;
class Arithmatic 
{
	public void arithmatic1()
	{
		try{
			int a=10,b=0;
			int c=a/b;
			System.out.println("Result = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by 0");
		}
	}
	public void arrayindeoutofbound()
	{
		try{
			int a[]=new int[3];
			a[6]=15;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index is Out Of Bounds ");
		}
	}
	public void filenotfound()
	{
		try{
			File file=new File("C://abc.txt");
			FileReader fr=new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist");
		}
	}
	public void nullpointer()
	{
		try{
			String a=null;
			System.out.println(a.charAt(0));
		}
		catch (NullPointerException e) {
            System.out.println("Null Pointer Exception..");
        }
	}
	public static void main(String args[])
	{
		Arithmatic ex=new Arithmatic();
		ex.arithmatic1();
		ex.arrayindeoutofbound();
		ex.filenotfound();
		ex.nullpointer();
	}
}
