import java.time.Duration;

public class Duration_3 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofHours(3);
        Duration duration2 = Duration.ofHours(1);

        Duration result = duration1.minus(duration2);
        System.out.println("Result: " + result);
    }
}
