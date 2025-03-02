package strings;
import java.util.*;
public class AllOccuranceOfString {
    public static void main(String[] args) {
        String s="krushna pawar";
        boolean b[]=new boolean[s.length()];

        for(int i=0;i<s.length();i++)
        {int count=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                    b[j]=true;
                }
            }
            if(!b[i] && s.charAt(i)!=' ')
            {
                System.out.println(s.charAt(i)+" ======= "+count);
            }
        }

    }
}
