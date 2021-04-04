import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*public class B1498
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int W = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

            for(int i=0; i<n; i++)
            {
                pq.add(sc.nextInt());
            }
            
            pq1.add(W-pq.remove());
            while(pq.size()>0)
            {
                int x = pq.remove();
                if(pq1.peek() >= x)
                {
                    int y = pq1.remove();
                    pq1.add(y-x);
                }
                else
                {
                    pq1.add(W-x);
                }

            }
            System.out.println(pq1.size());
        }
    }*/
class B1498
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int data, count;
            int n = sc.nextInt();
            int W = sc.nextInt();
            int[] c = new int[21];
            for(int i=0; i<=20; i++) c[i] = 0;
            for(int i=0; i<n; i++)
            {

                count = 0;
                data = sc.nextInt();
                while(data > 1)
                {
                    data /=2;
                    count++;
                }
                c[count]++;
            }

            int height = 0;

            while(true)
            {
                int rem = W;
                int flag = 0;
                for(int i = 20; i>=0; i--)
                {
                    count=c[i];
                    if(count > 0)
                        flag = 1;
                    int x = Math.min(rem/(1<<i), count);
                    int value = x * (1<<i);
                    rem -= value;
                    c[i] -= x;
                }

                if(flag == 0)
                    break;
                height++;

            }
            System.out.println(height);
        }
    }
}
