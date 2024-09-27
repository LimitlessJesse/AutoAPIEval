import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class JapaneseDate_2 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.now();
        JapaneseEra era = japaneseDate.getEra();
        System.out.println("Current Japanese Era: " + era.toString());
    }
}
