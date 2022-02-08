import java.util.Scanner;
public class sum
{
   public static void main(String args[])
   {

     int i,n,sum=0;
     Scanner obj= new Scanner(System.in);
     System.out.println("Enter the number");
     n = obj.nextInt();
     for(i=1;i<=n;i++)
     {
         sum=sum+i;
     }

    System.out.println("sum=" +sum);
   }
}
