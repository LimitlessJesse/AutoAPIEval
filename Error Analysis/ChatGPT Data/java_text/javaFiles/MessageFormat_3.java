import java.text.MessageFormat;
import java.util.Locale;

public class MessageFormat_3 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        MessageFormat msgFmt = new MessageFormat("Hello, {0}");
        msgFmt.setLocale(locale);
        
        Object[] params = {"World"};
        String formattedMessage = msgFmt.format(params);
        System.out.println(formattedMessage);
    }
}
