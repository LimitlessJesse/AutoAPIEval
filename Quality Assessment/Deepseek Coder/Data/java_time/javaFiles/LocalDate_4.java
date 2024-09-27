import java.time.LocalDate;
import java.time.Month;

public class LocalDate_4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        System.out.println("Current Month: " + month);
    }
}
