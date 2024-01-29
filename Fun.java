class Sample
{
    String cab;
    public static void play()
    {
        System.out.println("Your vedio is playing...");
    }
    public static String getcab(int cab_fare)
    {
        String cab="Yellow cab";
        int Fare=cab_fare;
        System.out.println("Fare:"+Fare);
        return cab;
    }
}
class Fun
{
    public static void main(String args[])
    {
        
        Sample.play();
        String str=Sample.getcab(150);
        System.out.println(str);

    }
}