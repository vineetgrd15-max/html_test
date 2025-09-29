import java.util.Scanner;
class Age
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=s.nextInt();
        if(a>=18)
        {
System.out.println("you are eligible for voting");
        }
else
{
System.out.println("you are not eligible");
}
    }
    }
