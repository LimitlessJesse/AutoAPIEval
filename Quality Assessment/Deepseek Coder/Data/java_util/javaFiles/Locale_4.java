import java.util.Locale;

public class Locale_4 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String displayLanguage = locale.getDisplayLanguage(new Locale("fr", "FR"));
        System.out.println(displayLanguage);
    }
}
