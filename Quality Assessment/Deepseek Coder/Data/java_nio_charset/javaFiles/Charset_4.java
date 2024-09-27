import java.nio.charset.Charset;
import java.util.Map;

public class Charset_4 {
    public static void main(String[] args) {
        Map<String, Charset> charsets = Charset.availableCharsets();
        boolean result = charsets.containsKey("UTF-8");
        System.out.println("Is UTF-8 available? " + result);
    }
}
