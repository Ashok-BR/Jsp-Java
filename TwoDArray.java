import java.util.Scanner;
class Sample
{
    Scanner s=new Scanner(System.in);
    int a[][]=new int[3][4];
    public void getdata()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
    
    public void show()
     {
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(a[i][j]);	
		
            }
        }
     }
}
public class TwoDArray {
    public static void main(String args[])
    {
        
        Sample sa=new Sample();
        sa.getdata();

    }
}