import java.time.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofHours(2);
        Duration duration2 = Duration.ofMinutes(30);
        
        Duration result = duration1.plus(duration2);
        
        System.out.println("Result: " + result);
    }
}
