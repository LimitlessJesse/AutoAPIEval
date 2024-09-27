import java.time.LocalDateTime;

public class LocalDateTime_21 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime future = now.plusSeconds(10);
        System.out.println("Future date and time: " + future);
    }
}
