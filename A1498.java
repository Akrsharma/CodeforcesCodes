import java.util.Scanner;



public class A1498
{


    private static long gcd(long a, long b)
    {
        if(b == 0)
            return a;
        return gcd(b, a%b);
        
    }
    private static long sumofDigits(long n)
    {
        long sum = 0;
        while(n > 0)
        {
            sum += n%10;
            n/=10;
        }

        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            if(gcd(n,sumofDigits(n)) != 1)
                System.out.println(n);
            else if(gcd(n+1,sumofDigits(n+1)) != 1)
                System.out.println(n+1);
            else
                System.out.println(n+2);
        }
    }
}