import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalQueries;

public class TemporalQueries_5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = date.query(TemporalQueries.localTime());
        System.out.println(time);
    }
}
