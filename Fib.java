class Fib
{
public static void main(String args[])
{
int a1=0;
int a2=1;
int count=8;
System.out.println(a1);
System.out.println(a2);
for(int i=0;i<count;i++)
{
int a3=a1+a2;
System.out.println(a3);
a1=a2;
a2=a3;				
}
}
}					