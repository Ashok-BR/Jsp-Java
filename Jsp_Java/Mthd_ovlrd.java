package Jsp_Java;
class Test1
{
    static void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    static void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
}
public class Mthd_ovlrd {
    public static void main(String args[])
    {
        Test1.add(5, 06);
        Test1.add(8,9,29);
    
    }
    
}
