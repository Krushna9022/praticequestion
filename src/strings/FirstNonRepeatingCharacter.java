package strings;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char ch = nonRepatingChar("kkkkpp");
        if (ch == '@') {
            System.out.println(" not found ");
        }

    }

    public static char nonRepatingChar(String s) {
        boolean b[] = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    b[j] = true;
                }
            }
            if (count == 1 && !b[i]) {
                return s.charAt(i);
            }
        }
        return '@';
    }
}
