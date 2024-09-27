import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Duration_1 {
    public static void main(String[] args) {
        Duration duration = Duration.of(5, ChronoUnit.SECONDS);
        System.out.println("Duration: " + duration.getSeconds() + " seconds");
    }
}
