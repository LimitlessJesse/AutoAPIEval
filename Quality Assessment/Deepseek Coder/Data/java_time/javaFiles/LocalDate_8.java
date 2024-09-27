import java.time.LocalDate;

public class LocalDate_8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
    }
}
