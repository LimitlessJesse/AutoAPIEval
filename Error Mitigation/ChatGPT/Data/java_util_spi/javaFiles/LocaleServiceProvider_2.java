import java.util.spi.LocaleServiceProvider;
import java.util.Locale;

public class LocaleServiceProvider_2 {
    public static void main(String[] args) {
        MyLocaleServiceProvider provider = new MyLocaleServiceProvider();
        Locale locale = new Locale("en", "US");
        boolean isSupported = provider.isSupportedLocale(locale);
        System.out.println("Is locale supported: " + isSupported);
    }
}

class MyLocaleServiceProvider extends LocaleServiceProvider {
    @Override
    public boolean isSupportedLocale(Locale locale) {
        // Add your implementation here
        return false;
    }
}
