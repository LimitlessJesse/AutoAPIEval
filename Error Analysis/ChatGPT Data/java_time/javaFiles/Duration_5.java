import java.time.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(-30);
        System.out.println(duration.isNegative()); // Output: true
    }
}
