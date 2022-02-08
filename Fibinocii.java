//program to find fibinocci of a number 
import java.util.Scanner;
class fibinocii
{
    public static void main(String args[])
    {
        int n,n1= 0,n2 = 1,n3,i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        n= obj.nextInt();
        for(i=1;i<=n;i++)
        {
             System.out.println(n1 +" ");
             n3 = n1+n2;
             n1= n2;
             n2 = n3;
        }
    }
}