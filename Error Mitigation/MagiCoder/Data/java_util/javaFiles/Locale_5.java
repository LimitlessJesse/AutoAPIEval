import java.util.Locale;

public class Locale_5 {
    public static void main(String[] args) {
        Locale locale = new Locale("fr", "FR");
        System.out.println(locale.getDisplayLanguage(new Locale("en", "US")));
    }
}
