package strings;

public class CompareTwoString {
    public static void main(String[] args) {
        String s1="krushna";
        String s2="krushna";
        if(s1.length()==s2.length())
        {
            boolean flag=true;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    flag=false;
                }
            }
            if(flag)
            {
                System.out.println("String are equals");
            }
            else
            {
                System.out.println("String are not equal");
            }
        }
        else {
            System.out.println("String are not equal");

        }
    }
}
