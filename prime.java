import java.util.scanner;
public class prime 
{
    Scanner obj = new Scanner(System.in)
    public static void main(String args[])
    {
        int num 
        boolean isprime = true;
        
        for(int i = 2;i<num;i++)
        if(num%i==0)
        {
             isprime=false;
             break;
        }
    }
    if(isprime)
    {
        System.out.println(num + "is a prime number");
    }
    else 
    {
       System.out.println(num + "is not a prime number");
    }
}
