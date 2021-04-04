import java.util.Scanner;

public class A270
{
    static int t;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0)
        {
            n = sc.nextInt();
            if(360%(180-n) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}