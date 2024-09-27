import javax.security.auth.callback.LanguageCallback;
import java.util.Locale;

public class LanguageCallback_2 {
    public static void main(String[] args) {
        LanguageCallback languageCallback = new LanguageCallback();
        Locale locale = new Locale("en", "US");
        languageCallback.setLocale(locale);
    }
}
