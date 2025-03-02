package strings;

public class ToggleCase {
    public static void main(String[] args) {
        String s="KrUsHnA";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                char c=s.charAt(i);
                s1+= (char)(c-32);
            }
            else  if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                char c=s.charAt(i);
                s1+= (char) (c+32);
            }
        }
        System.out.println(s);
        System.out.println(s1);
    }
}
