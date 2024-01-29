package Jsp_Java;

public class PayMentsTypes {
    
    static void pay()
    {
        System.out.println("Payment done via cash");
    }
    static void pay(long card_no,int cvv)
    {
        System.out.println("Payment done via card");

    }
    static void pay(String user_id,String password)
    {
        System.out.println("Payment done via Net Banking");

    }
    static void pay(String upi,int pin)
    {
        System.out.println("Recieved paytm payement of 10 rupees");
    }
    public static void main(String[] args) {
        pay();
        pay(546345453, 566);
        pay("ashok@3824", "abr@453");
        pay("6300452069@ybl", 814236);
    }
}
