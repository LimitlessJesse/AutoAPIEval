import java.time.LocalDate;
import java.time.Year;

public class Year_5 {
    public static void main(String[] args) {
        Year year = Year.of(2022);
        LocalDate date = year.atDay(100);
        System.out.println(date);
    }
}
