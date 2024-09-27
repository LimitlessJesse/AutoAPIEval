import java.util.Locale;

public class Locale_9 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        try {
            String iso3Language = locale.getISO3Language();
            System.out.println("ISO 3-letter language code: " + iso3Language);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
