import java.util.Scanner;
public class oddeven
{
    public static void main(String args[])
    {
        int number,remainder;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer number");
        number = obj.nextInt();
        remainder = number % 2;
        if(remainder ==0)
          System.out.println("The number is even");
        else
          System.out.println("The number is odd");
    }
}