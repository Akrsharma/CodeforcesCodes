import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = new String("");
        int size = str.length();
        for(int i=0; i<size; i++)
        {
            //System.out.println(str.charAt(i)+0);
            if(str.charAt(i) == 'Y' ||str.charAt(i) == 'y' ||str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' 
            || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                continue;
            }
            else
            {
                result += '.';
                result += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
