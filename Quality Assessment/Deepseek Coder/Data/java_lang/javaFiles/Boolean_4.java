import java.lang.Boolean;

public class Boolean_4 {
    public static void main(String[] args) {
        String str1 = "true";
        String str2 = "false";
        String str3 = "randomString";

        boolean bool1 = Boolean.parseBoolean(str1);
        boolean bool2 = Boolean.parseBoolean(str2);
        boolean bool3 = Boolean.parseBoolean(str3);

        System.out.println(bool1); // Output: true
        System.out.println(bool2); // Output: false
        System.out.println(bool3); // Output: false
    }
}
