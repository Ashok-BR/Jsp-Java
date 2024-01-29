public class Test {
    static void dis1(int x) {
        System.out.println("x");
        dis3("45");
        System.out.println(x);
    }

    static void dis2(int x) {
        System.out.println(x);
    }
    
    static void dis3(String x) {
        System.out.println(x);
        dis2(45);
        System.out.println("x");
    }

    public static void main(String[] args) {
        dis3("45");
        dis1(11);
        
    }
}
