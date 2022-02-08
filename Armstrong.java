import java.util.Scanner;
public class sum
{
   public static void main(String args[])
   {

     int n,arm=0,rem,temp;
     Scanner obj= new Scanner(System.in);
     System.out.println("Enter any number");
     n = obj.nextInt();
     temp=n;
     while(n>0)
     {
         rem=n%10;
         arm=(rem*rem*rem)+arm;
         n=n/10;
     }
     if(temp==arm)
        System.out.println("Armstrong Number");
     else
      System.out.println("Not Armstrong Number");
   }
}
