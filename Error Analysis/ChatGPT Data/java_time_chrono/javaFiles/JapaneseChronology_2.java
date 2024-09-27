import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseEra;

public class JapaneseChronology_2 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseChronology.INSTANCE.eraOf(5); // Example Japanese era value
        System.out.println("Japanese Era: " + era.toString());
    }
}
