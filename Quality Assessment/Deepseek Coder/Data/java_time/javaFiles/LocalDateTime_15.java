import java.time.LocalDateTime;

public class LocalDateTime_15 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime future = now.plusYears(2);
        System.out.println("Date and time 2 years from now: " + future);
    }
}
