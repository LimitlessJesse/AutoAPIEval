import java.time.LocalDate;

public class LocalDate_9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Today: " + today);
        System.out.println("Yesterday: " + yesterday);
    }
}
