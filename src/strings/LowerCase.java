package strings;

public class LowerCase {
    public static void main(String[] args) {
        String str="Krushna";
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<'z')
            {
                char c=str.charAt(i);
                str1+=(char)(c-32);
            }
            else
            {
                str1+=str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
