import java.time.LocalDate;
import java.time.Year;

public class LocalDate_3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Year year = Year.now();
        System.out.println("Current Year: " + year.getValue());
    }
}
