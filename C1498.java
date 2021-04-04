import java.util.Scanner;

public class C1498
{
    static int mod = 1000000007;
    static int dp[][][]  = new int[1001][1001][2];

    static int solve(int i,int k, int d, int n)
    {
        if(k == 1)
            return 0;
        if(dp[i][k][d] != -1) 
            return dp[i][k][d];
        int ans1 , ans2 ;
        if(d == 0)
        {
            ans1 = 1 + (i>1 ? solve(i-1,k-1,1,n) : 0);
            ans2 = (i<n ? solve(i+1, k, 0, n) : 0);
        }

        else
        {
            ans1 = (i>1 ? solve(i-1, k, 1, n) : 0);
            ans2 = 1 + (i<n ? solve(i+1, k-1, 0, n) : 0);
        }
        dp[i][k][d] = (ans1+ans2)%mod;
        return dp[i][k][d];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i=0; i<=n; i++)
            {
                for(int j=0; j<=k; j++)
                {
                    dp[i][j][0] = -1;
                    dp[i][j][1] = -1;
                }
            }
            System.out.println((1+solve(1,k,0,n))%mod);
            
        }
        
    }
}