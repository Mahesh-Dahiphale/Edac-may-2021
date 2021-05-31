interface SecInterface
{
public void dispTime_InSec();

}
interface HourInterface
{
public void dispTime_Inhrs();

}

class Demotime implements SecInterface, HourInterface
{
public void dispTime_InSec()
{
System.out.println("Some Seconds....:");
}
public void dispTime_Inhrs()
{
System.out.println("Hource....:");
}
}
class Time{
public static void main(String[] args)
{
Demotime obj=new Demotime();
obj.dispTime_InSec();
obj.dispTime_Inhrs();
}
}
