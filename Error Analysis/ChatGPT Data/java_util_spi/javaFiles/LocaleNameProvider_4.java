import java.util.Locale;
import java.util.spi.LocaleNameProvider;

public class LocaleNameProvider_4 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        LocaleNameProvider localeNameProvider = new LocaleNameProvider() {
            @Override
            public String getDisplayScript(String script, Locale locale) {
                return script.toUpperCase();
            }
        };
        
        String script = "latin";
        String displayScript = localeNameProvider.getDisplayScript(script, locale);
        System.out.println("Display script for " + script + " in " + locale + ": " + displayScript);
    }
}
