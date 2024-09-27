import java.util.Locale;
import java.util.spi.LocaleNameProvider;

public class LocaleNameProvider_3 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        LocaleNameProvider localeNameProvider = LocaleNameProvider.localeNameProvider();
        String variant = localeNameProvider.getDisplayVariant("en_US", locale);
        System.out.println("Display Variant: " + variant);
    }
}
