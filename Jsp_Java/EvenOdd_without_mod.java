package Jsp_Java;

public class EvenOdd_without_mod {
    static int a;
    public static void check(int n)
    {
        if((n/2)*2==n)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public static void check1(int n)
    {
        if ((n & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }


    public static void main(String[] args) {
        check(8);
        
        check1(7);
    }
    
}
