import java.util.Formatter;
import java.util.Locale;

public class Formatter_3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(Locale.US);
        String formattedString = formatter.format("Hello, %s", "World").toString();
        System.out.println(formattedString);
        formatter.close();
    }
}
