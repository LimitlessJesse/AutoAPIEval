import java.util.Locale;

public class Locale_12 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String countryCode = locale.getCountry();
        System.out.println("Country Code: " + countryCode);
    }
}
