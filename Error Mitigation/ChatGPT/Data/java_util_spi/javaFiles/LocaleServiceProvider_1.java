import java.util.spi.LocaleServiceProvider;
import java.util.Locale;

public class LocaleServiceProvider_1 {
    public static void main(String[] args) {
        LocaleServiceProvider provider = new LocaleServiceProvider() {
            @Override
            public Locale[] getAvailableLocales() {
                return Locale.getAvailableLocales();
            }
        };

        Locale[] availableLocales = provider.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale);
        }
    }
}
