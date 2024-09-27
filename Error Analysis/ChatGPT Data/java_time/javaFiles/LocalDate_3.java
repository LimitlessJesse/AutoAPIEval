import java.time.LocalDate;

public class LocalDate_3 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(7);
        System.out.println("Current date: " + currentDate);
        System.out.println("Future date after adding 7 days: " + futureDate);
    }
}
