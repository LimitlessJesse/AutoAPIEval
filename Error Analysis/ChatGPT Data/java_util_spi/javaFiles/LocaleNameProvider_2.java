import java.util.Locale;
import java.util.spi.LocaleNameProvider;

public class LocaleNameProvider_2 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        LocaleNameProvider localeNameProvider = LocaleNameProvider.provider();
        String countryName = localeNameProvider.getDisplayCountry("US", locale);
        System.out.println("Country Name: " + countryName);
    }
}
