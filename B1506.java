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

public class B1506
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0)
        {
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            StringBuffer sb = new StringBuffer();
            sb.append(str);
            int size = sb.length();
            int d = 0;
            int i = 0;
            int ans = 0;
            int farthest=0;
            int flag = 0;
            while(i<size)
            {
                
                if(sb.charAt(i) == '.')
                {
                    i++;
                    //if(i != 0 && sb.charAt(i-1) == '*')
                        //farthest = i-1;
                    
                }
                else
                {
                    if(flag == 0)
                    {
                        //System.out.println(d+" "+farthest+" "+i);
                        ans++;
                        d = i; 
                        i++;
                        flag = 1;
                    }
                    else
                    {
                        if(i-d > k)
                        {
                            if(farthest != 0)
                            {
                                //System.out.println(d+" "+farthest+" "+i);
                                ans++;
                                d = farthest;

                                farthest = 0;
                            }

                        }
                        else
                        {
                            farthest = i;
                            i++;
                            
                        }
                    }
                }

                
            }
            if(farthest != 0)
                ans++;
            System.out.println(ans);

        }
    }
}
