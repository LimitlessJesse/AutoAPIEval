import java.time.LocalDate;
import java.time.Month;

public class LocalDate_4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        System.out.println("Current Month: " + month);
    }
}
