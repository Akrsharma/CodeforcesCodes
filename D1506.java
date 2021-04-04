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

/*public class D1506
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int data;
            Map<Integer,Integer> hm = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0; i<n; i++)
            {
                data = sc.nextInt();
                if(hm.containsKey(data) == false)
                    hm.put(data, 1);
                else
                    hm.put(data, hm.get(data)+1);
            }
            for(Entry<Integer, Integer> e : hm.entrySet())
            {
                
                pq.add(e.getValue());
            }
            while(pq.size()>1)
            {
                int a1 = pq.poll();
                int a2 = pq.poll();
                if(a1 != 1)
                    pq.add(a1-1);
                if(a2 != 1)
                    pq.add(a2-1);
            }
            if(pq.size() == 0)
                System.out.println("0");
            else
                System.out.println(pq.peek());
            
            


        }
    }
}*/
public class D1506
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int data;
            Map<Integer,Integer> hm = new HashMap<>();
            int max = 0;
            int tmp;
            for(int i=0; i<n; i++)
            {
                tmp = sc.nextInt();
                hm.put(tmp, hm.getOrDefault(tmp, 0)+1);
                max = Math.max(hm.get(tmp), max);
            }

            if(n%2 == 0)
            {
                if(max <= n/2)
                    System.out.println("0");
                else
                    System.out.println(max-(n-max));
            }
            else
            {
                if(max <= n/2)
                {
                    System.out.println("1");
                }
                else
                    System.out.println(max-(n-max));
            }
            


        }
    }
}