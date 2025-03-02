package strings;

public class ConCatString {
    public static void main(String[] args) {
        String str="Krushna";
        String str1="Pawar";
        String str3="";
       // str3=str.concat(" " +str1);
        for (int i = 0; i <str.length() ; i++) {
            str3+=str.charAt(i);
        }
        str3=str3+" ";
        for(int i=0;i<str1.length();i++)
        {
            str3+=str1.charAt(i);
        }
        System.out.println(str3);

    }
}
