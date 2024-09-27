import java.util.Locale;

public class Locale_15 {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale.getDisplayName());
        }
    }
}
