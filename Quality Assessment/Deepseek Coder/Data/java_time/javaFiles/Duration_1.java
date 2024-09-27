import java.time.Duration;

public class Duration_1 {
    public static void main(String[] args) {
        Duration duration = Duration.ofMillis(1000);
        long millis = duration.toMillis();
        System.out.println(millis);
    }
}
