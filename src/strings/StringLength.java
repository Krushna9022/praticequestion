package strings;


public class StringLength {
    public static void main(String[] args) {
        String str = "Krushna";
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {

            //System.out.println(e.getMessage());
        }
        System.out.println(length);
    }
}
