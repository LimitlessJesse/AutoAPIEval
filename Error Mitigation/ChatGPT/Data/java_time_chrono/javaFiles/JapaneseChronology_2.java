import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseEra;
import java.time.DateTimeException;

public class JapaneseChronology_2 {
    public static void main(String[] args) {
        JapaneseChronology japaneseChronology = JapaneseChronology.INSTANCE;
        
        try {
            JapaneseEra era = japaneseChronology.eraOf(JapaneseEra.HEISEI.getValue());
            System.out.println("Era: " + era);
        } catch (DateTimeException e) {
            System.out.println("Invalid era value");
        }
    }
}
