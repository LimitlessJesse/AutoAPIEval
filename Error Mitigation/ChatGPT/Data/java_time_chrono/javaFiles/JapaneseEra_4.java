import java.time.chrono.JapaneseEra;
import java.time.DateTimeException;

public class JapaneseEra_4 {
    public static void main(String[] args) {
        int japaneseEraValue = 1;
        
        try {
            JapaneseEra japaneseEra = JapaneseEra.of(japaneseEraValue);
            System.out.println("Japanese Era: " + japaneseEra);
        } catch (DateTimeException e) {
            System.out.println("Invalid Japanese Era value");
        }
    }
}
