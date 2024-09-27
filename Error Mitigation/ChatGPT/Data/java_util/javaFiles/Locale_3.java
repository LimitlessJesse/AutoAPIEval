import java.util.Locale;

public class Locale_3 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String languageCode = locale.getLanguage();
        System.out.println("Language code: " + languageCode);
    }
}
