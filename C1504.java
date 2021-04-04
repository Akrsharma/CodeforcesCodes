import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class C1504
{
    static int mod = 1000000007;
    

    static boolean check(String sb1, String sb2, int len)
    {
        Stack<Character> st1 = new Stack<>();
        int flag = 0;
        for(int i=0; i<len; i++)
        {
            if(sb1.charAt(i) == '(')
            {
                st1.push('(');
            }
            else
            {
                if(st1.isEmpty() == false)
                {
                    st1.pop();
                }
                

            }
        }
        if(st1.isEmpty() == false)
            return false;
        st1.clear();

        for(int i=0; i<len; i++)
        {
            if(sb2.charAt(i) == '(')
            {
                st1.push('(');
            }
            else
            {
                if(st1.isEmpty() == false)
                {
                    st1.pop();
                }
                else
                    flag = 1;
                

            }
        }

        if(st1.isEmpty() == false)
            return false;
        if(flag == 1)
            return false;
        return true;
    }
    static void solve(int i, String str, int size, String sb1, String sb2, StringBuffer rs1, StringBuffer rs2, HashMap<String, Boolean> hm)
    {
        if(i == size)
        {
            //System.out.println(sb1 + "     "+sb2);
            if(rs1.toString().equals("") == false)
            {
                hm.put(i+sb1, false);
                return;
            }
            if(check(sb1,sb2,size) == true)
            {
                rs1 = rs1.append(sb1);
                rs2 = rs2.append(sb2);
                return;
            }
            hm.put(i+sb1, false);
            return;
        }
        if(hm.containsKey(i+sb1) == true)
            return;
        if(str.charAt(i) == '1')
        {
            solve(i+1, str, size, sb1 + "(", sb2 + "(", rs1, rs2,hm);

            solve(i+1, str, size, sb1+ ")", sb2 + ")", rs1, rs2,hm);

        }
        else
        {
            solve(i+1, str, size, sb1 + "(", sb2 + ")", rs1, rs2,hm);
            solve(i+1, str, size, sb1+ ")", sb2 + "(", rs1, rs2,hm);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int size = sc.nextInt();
            String str = sc.next();
            String sb1 = "", sb2 = "";
            StringBuffer rs1= new StringBuffer(""),rs2 = new StringBuffer("");
            HashMap<String, Boolean> hm = new HashMap<>();
            solve(0,str, size, sb1, sb2, rs1, rs2,hm);
            if(rs1.toString().equals("") == true)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(rs1 + "\n" + rs2);
            }

        }
        
    }
}