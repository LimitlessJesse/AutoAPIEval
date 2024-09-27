import java.util.Formatter;
import java.util.Locale;

public class Formatter_5 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Locale locale = Locale.US;
        String format = "Hello, %s! Today is %tF";
        String name = "John";
        long currentTime = System.currentTimeMillis();

        formatter.format(locale, format, name, currentTime);
        System.out.println(formatter);
        
        formatter.close();
    }
}
