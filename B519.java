import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B519
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int data;  
        int xor1 = 0, xor2 = 0;
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            data = sc.nextInt();
            a.add(data);
            xor1  = xor1 ^ a.get(i);
        }
        for(int i=0; i<n-1; i++)
        {
            data = sc.nextInt();
            xor1 = xor1 ^ data;
            xor2 = xor2 ^ data;
        }
        System.out.println(xor1);
        for(int i=0; i<n-2; i++)
        {
            xor2 = xor2 ^ sc.nextInt();
        }
        System.out.println(xor2);

        

    }
}