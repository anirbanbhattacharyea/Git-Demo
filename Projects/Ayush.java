import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =in.nextInt();
        int nn=n;
        int d=0;
        int rev=0;
        while(nn!=0)
        {
            d=nn%10;
            rev=rev*10+d;
            nn/=10;
        }
        if(rev==n)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
