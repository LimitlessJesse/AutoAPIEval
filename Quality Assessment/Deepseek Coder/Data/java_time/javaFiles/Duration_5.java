import java.time.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        Duration duration = Duration.ofDays(5);
        long days = duration.toDays();
        System.out.println("Duration in days: " + days);
    }
}
