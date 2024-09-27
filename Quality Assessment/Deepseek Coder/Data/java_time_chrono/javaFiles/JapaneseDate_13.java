import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class JapaneseDate_13 {
    public static void main(String[] args) {
        // Create a JapaneseDate object
        JapaneseDate japaneseDate = JapaneseDate.now();

        // Create a TemporalAdjuster that adjusts the JapaneseDate to the next month
        TemporalAdjuster nextMonthAdjuster = TemporalAdjusters.ofDateAdjuster(temporal -> temporal.with(ChronoField.MONTH_OF_YEAR, temporal.get(ChronoField.MONTH_OF_YEAR) + 1));

        // Use the TemporalAdjuster to adjust the JapaneseDate
        JapaneseDate nextMonth = japaneseDate.with(nextMonthAdjuster);

        // Print the original and adjusted JapaneseDate
        System.out.println("Original JapaneseDate: " + japaneseDate);
        System.out.println("Adjusted JapaneseDate: " + nextMonth);
    }
}
