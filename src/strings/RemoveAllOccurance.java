package strings;

public class RemoveAllOccurance {
    public static void main(String[] args) {
        String s="aaaaabbbbbccaaaccddddaa";
        char ch='a';
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a')
            {
                s1+=s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
