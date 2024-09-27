import java.util.Locale;

public class Locale_13 {
    public static void main(String[] args) {
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = new Locale("en", "US");
        Locale locale3 = new Locale("fr", "FR");

        System.out.println(locale1.equals(locale2)); // true
        System.out.println(locale1.equals(locale3)); // false
        System.out.println(locale1.equals("en_US")); // false
    }
}
