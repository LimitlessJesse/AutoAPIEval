import java.util.Locale;

public class Locale_10 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String language = locale.getLanguage();
        System.out.println("Language code: " + language);
    }
}
