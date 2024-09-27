import java.nio.charset.Charset;
import java.util.SortedMap;

public class Charset_1 {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        
        System.out.println("Available charsets:");
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }
    }
}
