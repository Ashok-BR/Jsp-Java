package Jsp_Java;

public class Hello {
    static String fname(String fn)
{
    return fn;
}
static String lname(String ln)
{
    return ln;
}
static void full(String n1,String n2)
{
    System.out.println(n1+""+n2);
}
public static void main(String args[])
{
    String x=fname("Kiran");
    String y=lname("Kumar");
    full(x,y);
}
    
}
