public class Casting {
    static void cast()
    {
        byte b=34;
        int i=b;
        System.out.println(i);
        long l=i;
        System.out.println(l);
        long l1=54;
        byte b1=(byte)l1;
        System.out.println(b1);
        int i2=65;
        char c1=(char)i2;
        System.out.println(i2);
        System.out.println(c1);
    }   
    public static void main(String[] args) {
        cast();
    } 
}
