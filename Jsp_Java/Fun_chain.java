package Jsp_Java;

public class Fun_chain {
    static String fname(String n1)
    {
        return n1;
    }
    static String lname(String n2)
    {
        return n2;
    }
    static void fullname(String n1,String n2)
    {
        String x=fname(n1);
        String y=lname(n2);
        System.out.println(x+" "+y);
    }
    public static void main(String args[])
    {
        fullname("Ashok", "Amarendra");
    }
}
