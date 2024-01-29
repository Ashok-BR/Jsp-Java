package Jsp_Java;

public class Demo {
    static String fname(String n1)
    {
        return n1;
    }
    static String lname(String n2)
    {
        return n2;
    }
    static void flname(String x,String y)
    {
        String a=fname(x);
        String b=lname(y);
        System.out.println(a+" "+b);
    }
    public static void main(String arg[])
    {
        flname("kiran","kumar");
    }
    
}
