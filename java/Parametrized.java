import java.util.Scanner;
public class Parametrized
{
    int rollno;
    String name;
    Parametrized(int stdrollno,String stdname)
    {
        rollno= stdrollno;
        name= stdname;
    }
    void display()
    {
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
    }
    public static void main(String args[])
    {
        Parametrized obj=new Parametrized(1001, "vineet");
        obj.display();
    }
}