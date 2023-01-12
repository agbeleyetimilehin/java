import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        double k;int a,count=0;
        double r=0;
        System.out.println("Enter an integer");
        a=ob.nextInt();
        int b=a;
        while(b!=0)
        {b=b/10;
            count++;
        }
        b=a;
        for(int i=count;i>0;i--)
        {k=b%10;
            k*= Math.pow(10,i-1);
            r+=k;
            b=b/10;
        }

        if(a==r)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");
    }


}
