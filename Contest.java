import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import javax.lang.model.util.ElementScanner6;

public class Contest{
    static int h,w;
    static int[][] dp = new int[5][5];

    static int solve(int i, int j, int[][] cake, int dp[][])
    {
        if(i>=h || j>=w)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(i == h-1 && j == w-1)
        {
            return 0;
        }

        if(i==h-1)
        {
            if(cake[i][j+1] == 0)
            {
                dp[i][j+1]=solve(i,j+1,cake, dp);
            }
            else
            {
                dp[i][j+1] = 1+solve(i,j+1, cake,dp);
            }
            return dp[i][j+1];
        }
        if(j == w-1)
        {
            if(cake[i+1][j] == 0)
            {
                dp[i+1][j]=solve(i+1,j,cake, dp);
            }
            else
            {
                dp[i+1][j] = 1+solve(i+1,j, cake,dp);
            }
            return dp[i+1][j];
        }
        if(cake[i+1][j] == 1 && cake[i][j+1] == 0)
        {
            dp[i+1][j] = 1+solve(i+1,j, cake,dp);
            return dp[i+1][j];
        }
        if(cake[i+1][j] == 0 && cake[i][j+1] == 1)
        {
            dp[i][j+1] = 1+solve(i,j+1, cake,dp);
            return dp[i][j+1];
        }
        if(cake[i+1][j] == 0 && cake[i][j+1] == 0)
        {
            int ans1 = solve(i,j+1, cake,dp);
            int ans2 = solve(i+1,j, cake,dp);
            if(ans1 > ans2)
            {
                dp[i][j+1] += dp[i][j];
                return dp[i][j+1];
            }
            else
            {
                dp[i+1][j] += dp[i][j];
                return dp[i+1][j];
            }
           
        }
        int ans1 = solve(i,j+1, cake,dp);
        int ans2 = solve(i+1,j, cake,dp);
        if(ans1 > ans2)
        {
            dp[i][j+1] += (dp[i][j] + 1);
            return dp[i][j+1];
        }
        else
        {
            dp[i+1][j] += (dp[i][j]+1);
            return dp[i+1][j];
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        /*for(int i=1; i<=n; i++)
        {
            if(i*i == n)
            {
                System.out.println(i);
                break;
            }
        }*/
        /*int m = sc.nextInt();
        if((n/m) %2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");*/
        h = sc.nextInt();
        w = sc.nextInt();
        int[][] cake = new int[h][w];
        String str;
        for(int i=0; i<h; i++)
        {
            str = sc.next();
            for(int j=0; j<w; j++)
            {
                if(str.charAt(j) == '.') cake[i][j] = 0;
                else cake[i][j] = 1;
                dp[i][j]  = -1;
            }
        }
        if(cake[0][0] == 1) dp[0][0] = 1;
        else
        dp[0][0] = 0;
        solve(0,0,cake,dp);
        System.out.println(dp[h-1][w-1]);
        
        
    }
}
