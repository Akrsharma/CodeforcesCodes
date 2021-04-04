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

public class C1_1497{


    static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            int n;
            n = sc.nextInt();
            int k = sc.nextInt();
            if(n%2 == 1)
            {
                System.out.println("1 " + n/2 + " "+ n/2);
            }
            else if(n%4 != 0)
            {
                System.out.println("2 " + (n/2 - 1) + " "+ (n/2 - 1));
            }
            else
            {
                System.out.println(n/2 + " "+ n/4 + " "+ n/4);
            }
        

        }
    }
}
