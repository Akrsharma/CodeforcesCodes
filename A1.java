//A. Theatre Square
import java.util.Scanner;




public class A1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int min = Math.min(n,m);
        int max = Math.max(n,m);

        System.out.println((long)(Math.ceil((double)n/a) * Math.ceil((double)m/a))); 
        ;
    }
}