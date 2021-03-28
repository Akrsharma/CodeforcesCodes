import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class B158
{
    static int result = 0;
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n,val;
        int one = 0, two = 0, three = 0, four = 0;
        //n = Integer.parseInt(br.readLine());
        n = sc.nextInt();
        //ArrayList<Integer> groups = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            //groups.add(Integer.parseInt(br.readLine()));
            val = sc.nextInt();
            if(val == 1)
                one++;
            else if(val == 2)
                two++;
            else if(val == 3)
                three++;
            else
                four++;
        }
        
        result += (two/2);
        result += four;
        result += three;

        one = one-three;
        if(two%2 == 1)
        {
            result++;
            one -= 2;
        }
        if(one>0)
            result += (one + 3)/4;

        System.out.println(result);
        sc.close();

    }
}