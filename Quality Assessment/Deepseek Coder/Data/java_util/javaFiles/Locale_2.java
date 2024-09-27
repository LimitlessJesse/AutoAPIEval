import java.util.Locale;

public class Locale_2 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        System.out.println("Default language: " + language);
    }
}
