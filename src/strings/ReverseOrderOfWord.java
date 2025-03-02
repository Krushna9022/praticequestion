package strings;

import java.util.*;

public class ReverseOrderOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        s = s + " ";
        String rev = "";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1 += s.charAt(i);
            } else {
                rev = s1 + " " + rev;
                s1 = "";
            }
        }
        System.out.println(rev);

    }
}
