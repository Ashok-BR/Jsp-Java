package Jsp_Java;

public class Return_fun {
    static int total(int phy,int che,int comp,int opt)
    {
        int tot=phy+che+comp+opt;
        return tot;
    }
    static void perc(int sum)
    {
        float percentage = (sum/400.0f) * 100;
        System.out.println(percentage);
    }
    public static void main(String[] args) {
        int x= total(70,80,95,89);
        perc(x);
    }
    
}
