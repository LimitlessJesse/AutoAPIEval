import java.time.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(5);
        long hours = duration.toHours();
        System.out.println("The duration in hours is: " + hours);
    }
}
