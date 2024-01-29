package Jsp_Java;
class Test1
{
    static void display()
    {
        System.out.println("This is display method form Test2");
    }
}
class Test2 extends Test1
{
    static void display()
    {
        System.out.println("This is Method Overriding");
    }
}
public class Mthd_ovrding {
    public static void main(String args[])
    {
        
         Test2.display();
    }
}
