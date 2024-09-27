import java.util.Locale;

public class Locale_7 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US", "WIN");
        System.out.println(locale.getDisplayVariant(Locale.US));
    }
}
