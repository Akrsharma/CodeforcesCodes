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

public class C1499{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            int n;
            n = sc.nextInt();
            long[] c = new long[n];
            long[] min = new long[n];
            long[] presum = new long[n];
            for(int i=0; i<n; i++)
                c[i] = sc.nextInt();

            min[0] = c[0];
            min[1] = c[1];
            for(int i=2; i<n; i++)
            {
                min[i] = Math.min(c[i], min[i-2]);
            }
            presum[0] = c[0];
            presum[1] = c[1];
            for(int i=2; i<n; i++)
            {
                presum[i] = c[i] + presum[i-2];
            }
            long min1 = Long.MAX_VALUE;
            for(int k=2; k<=n; k++)
            {
                long sum1 = presum[k-1]-min[k-1],sum2 = presum[k-2]-min[k-2];
                //System.out.println(sum1 + " "+ sum2 );
                int last = (k+1)/2;
                sum1 = sum1 + min[k-1]*(n-(last-1));
                if(k%2 == 0)
                    sum2 = sum2 + min[k-2]*(n-(last-1));
                else
                    sum2 = sum2 + min[k-2]*(n-(last-2));

                //System.out.println(ans);


                min1 = Math.min(sum1+sum2,min1);
            }
            System.out.println(min1);

        }
    }
}
