import java.util.Scanner;
public class Default
{
    int rollno;
    String name;
    Default()
    {
        rollno=1001;
        name="vineet";
    }
    void display()
    {
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
    }
    public static void main(String args[])
    {
        Default obj=new Default();
        obj.display();
    }
}