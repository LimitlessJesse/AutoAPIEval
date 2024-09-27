import java.time.Duration;

public class Duration_2 {
    public static void main(String[] args) {
        Duration duration = Duration.ofNanos(1000000000);
        long seconds = duration.toSeconds();
        System.out.println(seconds);  // Output: 1
    }
}
