import java.time.LocalDate;

public class LocalDate_10 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Yesterday: " + yesterday);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
    }
}
