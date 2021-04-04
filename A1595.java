import java.util.Arrays;
import java.util.Scanner;
public class A1595
{
    static int mod = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            double d = 0;
            long data1,data2;
            long x[] = new long[n];
            long y[] = new long[n];
            int j=0, k=0;
            for(int i=0; i<2*n; i++)
            {
                data1= sc.nextLong();
                data2 = sc.nextLong();
                if(data1 == 0)
                {
                    y[j++] = data2*data2;
                }
                else
                {
                    x[k++] = data1*data1;
                }
            }
            
            Arrays.sort(x);
            Arrays.sort(y);
            for(int i=0; i<n; i++)
            {
                //System.out.println(x[i]*x[i] + y[i] * y[i]);
                d += Math.sqrt(x[i]+y[i]);
            }
            System.out.println(d);
        }
        
    }
}