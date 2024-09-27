import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;

public class JapaneseDate_16 {
    public static void main(String[] args) {
        // Create a JapaneseDate object
        JapaneseDate japaneseDate = JapaneseDate.now();

        // Print the original JapaneseDate
        System.out.println("Original JapaneseDate: " + japaneseDate);

        // Use the with method to change the year
        JapaneseDate newJapaneseDate = japaneseDate.with(ChronoField.YEAR, 1990);

        // Print the new JapaneseDate
        System.out.println("New JapaneseDate: " + newJapaneseDate);
    }
}
