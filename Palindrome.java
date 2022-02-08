import java.util.Scanner;
public class sum
{
   public static void main(String args[])
   {

     int n,s=0,rem,temp;
     Scanner obj= new Scanner(System.in);
     System.out.println("Enter any number");
     n = obj.nextInt();
     temp=n;
     while(n>0)
     {
         rem=n%10;
         s=(s*10)+rem;
         n=n/10;
     }
     if(temp==s)
        System.out.println("Palindrome Number");
     else
      System.out.println("Not Palindrome  Number");
   }
}
