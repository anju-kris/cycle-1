import java.util.Scanner;
public class add2nos
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = obj.nextInt();
    int b = obj.nextInt();
    int sum = a+b;
    System.out.println("sum of "+a+" and "+b+" is "+sum);
    }
}