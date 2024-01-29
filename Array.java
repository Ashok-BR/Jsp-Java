import java.util.Scanner;
class Sample
{
    Scanner s=new Scanner(System.in);
    int a[][]=new int[3][4];
    public void getdata()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println("Enter the value for"+a[i][j]+":");
            }
        }
    }
        
}
public class Array {
    public static void main(String args[])
    {
        
        Sample sa=new Sample();
        sa.getdata();

    }
}