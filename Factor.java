//program to find factor of a number 
import java.util.Scanner;
class factor 
{
    public static void main(String args[])
    {
        int num,i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        num = obj.nextInt();
        for(i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.println(i+" ");
                }
            }
    }
}