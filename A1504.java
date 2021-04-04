import java.util.Arrays;
import java.util.Scanner;
public class A1504
{
    static int mod = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String str = sc.next();
            
            int size = str.length();
            int flag = 0;
            int i;
            for(i=0; i<size/2; i++)
            {
                if(str.charAt(i) == str.charAt(size-i-1))
                {
                    if(str.charAt(i) != 'a')
                    {
                        flag = 1;
                        str = "a"+str;
                        break;
                    }
                }
                else
                {
                    if(str.charAt(i) == 'a')
                    {
                        flag = 1;
                        str = "a" + str;
                        break;
                    }
                    else
                    {
                        flag = 1;
                        str = str + "a";
                        break;
                    }

                }

            }
            if(flag == 1)
            {
                System.out.println("YES");
                System.out.println(str);
            }
            else
            {
                if(size%2  == 1 && str.charAt(i) != 'a')
                {
                    System.out.println("YES");
                    System.out.println("a" + str);
                }
                else
                    System.out.println("NO");
            }
        }
        
    }
}