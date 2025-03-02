package strings;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s = "abcd";
        String s2 = "acdb";
        char ch1[] = s.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean flag=true;
        if(ch2.length==ch1.length)
        {
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    flag=false;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("not Anagram");
            }
            else {
                System.out.println("Anagram");
            }


        }
        else {
            System.out.println("not Anagram");
        }

}
}
