package strings;

public class FindWordInString {
    public static void main(String[] args) {
        String str="the sky is blue";

        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
