import java.time.YearMonth;
import java.time.temporal.TemporalAccessor;
import java.time.format.DateTimeFormatter;

public class YearMonth_1 {
    public static void main(String[] args) {
        TemporalAccessor temporal = YearMonth.now();
        YearMonth yearMonth = YearMonth.from(temporal);
        System.out.println(yearMonth);
    }
}
