package strings;

public class FirstOccurance {
    public static void main(String[] args) {
        String s1="krushna";
        char c='p';
        boolean flag=true;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==c)
            {
                flag=false;
                System.out.println((i+1));
                break;
            }
        }
        if(flag)
        {
            System.out.println("not found ");
        }
    }
}
