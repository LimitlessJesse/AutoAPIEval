import java.time.Duration;

public class Duration_2 {
    public static void main(String[] args) {
        Duration duration = Duration.ofDays(5);
        long days = duration.toDays();
        System.out.println("Days: " + days);
    }
}
