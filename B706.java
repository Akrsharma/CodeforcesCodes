import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class B706
{
    static int[] c = new int[100001]; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,q,priceperdrink;
        n = sc.nextInt();
        //ArrayList<Integer> price = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            priceperdrink = sc.nextInt();
            c[priceperdrink] += 1;

        }
        for(int i=1; i<=100000; i++)
        {
            c[i] += c[i-1];
        }

        q = sc.nextInt();
        ArrayList<Integer> coini = new ArrayList<>();
        for(int i=0; i<q; i++)
        {
            coini.add(sc.nextInt());

        }
        for(int i=0; i<q; i++)
        {
            if(coini.get(i)>100000)
                System.out.println(c[100000]);
            else
                System.out.println(c[coini.get(i)]);
        }


    }
}