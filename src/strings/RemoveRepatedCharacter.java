package strings;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepatedCharacter {
    public static void main(String[] args) {
        String s="kkppmmnop";
        char c[]=s.toCharArray();
        Set<Character> set=new LinkedHashSet();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        String newStr=s.replace('k','r');
        System.out.println(newStr);
        String s3="";
        for(Object obj:set)
        {
            //System.out.print(obj);
            Character c1=(Character)obj;
            s3+=c1;

        }
        System.out.println(s3);

    }
}
