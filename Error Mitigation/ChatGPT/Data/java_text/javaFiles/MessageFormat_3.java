import java.text.MessageFormat;
import java.util.Locale;

public class MessageFormat_3 {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("Hello, {0}");
        Locale newLocale = new Locale("en", "US");
        messageFormat.setLocale(newLocale);
    }
}
