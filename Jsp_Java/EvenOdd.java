package Jsp_Java;

public class EvenOdd {
    public static void check(int n)
    {
    if((n&1)==1)
    {
        System.out.println("odd");
    }
    else 
    {
        System.out.println("Even");
    }
}
    public static void main(String[] args) {
       check(5);

    }
    
}
