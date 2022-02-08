//program to find factorial of a number 
import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        int num,i,fact=1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        num = obj.nextInt();
        for(i=1;i<=num;i++)
        {
              fact=fact*i;
        }
        System.out.println("Factorial " + fact);
    }
}