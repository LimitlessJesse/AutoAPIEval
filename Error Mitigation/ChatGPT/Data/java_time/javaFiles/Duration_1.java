import java.time.Duration;

public class Duration_1 {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(60);
        System.out.println("Duration in seconds: " + duration.getSeconds());
    }
}
