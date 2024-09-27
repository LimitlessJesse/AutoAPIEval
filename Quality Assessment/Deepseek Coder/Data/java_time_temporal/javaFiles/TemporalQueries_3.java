import java.time.LocalDate;
import java.time.temporal.TemporalQueries;

public class TemporalQueries_3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate localDate = today.query(TemporalQueries.localDate());
        System.out.println("LocalDate: " + localDate);
    }
}
