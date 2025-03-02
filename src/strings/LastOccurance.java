package strings;

public class LastOccurance {
    public static void main(String[] args) {
        String s=new String("krushna pawar");
        char ch='a';
        int place=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                place=i;
            }
        }
        if(place!=-1)
        {
            System.out.println("found at "+(place+1));
        }
        else {
            System.out.println("not found");
        }
    }
}
