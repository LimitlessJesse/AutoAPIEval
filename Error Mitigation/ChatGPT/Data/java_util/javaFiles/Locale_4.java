import java.util.Locale;

public class Locale_4 {
    public static void main(String[] args) {
        Locale locale = new Locale("fr", "FR");
        String displayLanguage = locale.getDisplayLanguage();
        System.out.println("Display Language: " + displayLanguage);
    }
}
