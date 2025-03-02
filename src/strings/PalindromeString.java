package strings;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("enter the String");
        String s =new Scanner(System.in).nextLine();
        int j = s.length() - 1;
        boolean flag = true;
        for (int i = 0; i < s.length() / 2 && i < j; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            j--;
        }
        if(flag)
        {
            System.out.println(s+" is palindrome");
        }
        else {
            System.out.println(s+"  is not palindrome");
        }
    }
}
