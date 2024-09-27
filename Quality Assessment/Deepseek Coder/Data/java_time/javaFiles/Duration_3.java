import java.time.Duration;

public class Duration_3 {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(90);
        long minutes = duration.toMinutes();
        System.out.println(minutes);
    }
}
