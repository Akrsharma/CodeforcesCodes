import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class E1506
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int data;
            int[] q = new int[n];
            int[]  p1 = new int[n];
            int[]  p2 = new int[n];
            PriorityQueue<Integer> pq1 = new PriorityQueue<>();
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0; i<n; i++)
            {
                data = sc.nextInt();
                q[i] = data;
            }
            //Printing for minimal permutation
            int j=1;
            p1[0] = q[0];
            p2[0] = q[0];
            for(int i=0; i<n; i++)
            {
                if(i == 0)
                {
                    for(int k=1; k<q[i]; k++)
                    {
                        pq1.add(k);
                    }
                }
                else
                {
                    if(q[i] != q[i-1])
                    {
                        p1[j++] = q[i];
                        for(int k = q[i-1]+1; k<q[i]; k++)
                            pq1.add(k);
                    }
                    else
                    {
                        p1[j++] = pq1.poll();                        

                    }
                }
            }

            j=1;
            for(int i=0; i<n; i++)
            {
                if(i == 0)
                {
                    for(int k=1; k<q[i]; k++)
                    {
                        pq2.add(k);
                    }
                }
                else
                {
                    if(q[i] != q[i-1])
                    {
                        p2[j++] = q[i];
                        for(int k = q[i-1]+1; k<q[i]; k++)
                            pq2.add(k);
                    }
                    else
                    {
                        p2[j++] = pq2.poll();                        

                    }
                }
            }
            for(int i=0; i<n; i++)
                System.out.print(p1[i]+" ");
            System.out.println();

            for(int i=0; i<n; i++)
                System.out.print(p2[i]+" ");
            System.out.println();

            
        }
    }
}