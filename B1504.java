import java.util.Arrays;
import java.util.Scanner;
public class B1504
{
    static int mod = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int size = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            if(str1.equals(str2))
            {
                System.out.println("YES");
                continue;
            }
            int i;
            int flag = 0;
            int a0=0, a1=0;
            int b0 = 0, b1= 0;
            for(i=0; i<size; i++)
            {
                if(str1.charAt(i) == '0')
                {
                    a0++;
                }
                else
                {
                    a1++;
                    flag = 1;
                }
                if(str2.charAt(i) == '0')
                    b0++;
                else
                {
                    b1++;
                }
                
                
                
                
            }
            System.out.println(finala + " "+ finalb);
            if(finala > finalb)
            {
                System.out.println("NO");
            }
            else if(finala < finalb)
            {
                
            }
        }
        
    }
}