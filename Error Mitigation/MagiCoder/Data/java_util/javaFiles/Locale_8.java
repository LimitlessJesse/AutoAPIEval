import java.util.Locale;

public class Locale_8 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        String iso3Country = locale.getISO3Country();
        System.out.println("ISO 3166-1 alpha-3 country code: " + iso3Country);
    }
}
