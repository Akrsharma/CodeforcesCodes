import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class B1497
{
    static int mod = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int  n = sc.nextInt();
            int m= sc.nextInt();
            int[] marr = new int[m];
            for(int i=0; i<n; i++)
            {
                marr[sc.nextInt()%m]++;
            }
            int ans = 0;
            if(marr[0] != 0)
                ans = 1;
            
            int l=1, r = m-1;
            while(l<=r)
            {
                if(l == r)
                {
                    if(marr[l] != 0)
                        ans++;
                    break;
                }
                if(marr[l] == 0 || marr[r] == 0)
                {
                    if(marr[l] != 0)
                    {
                        ans += marr[l];
                    }
                    else
                    {
                        ans += marr[r];
                    }
                    
                    l++;
                    r--;

                }
                else if(marr[l] == marr[r])
                {
                    ans++;
                    l++;
                    r--;
                }
                else
                {
                    ans++;
                    int val = Math.abs(marr[l]-marr[r])-1;
                    ans += val;
                    l++;
                    r--;
                }
            }
            System.out.println(ans);
            
        }
        
    }
}