import java.time.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofSeconds(30);
        Duration duration2 = Duration.ofSeconds(10);
        
        Duration result = duration1.plus(duration2);
        
        System.out.println("Result: " + result.getSeconds() + " seconds");
    }
}
