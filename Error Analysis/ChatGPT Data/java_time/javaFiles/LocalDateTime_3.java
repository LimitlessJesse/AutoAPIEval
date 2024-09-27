import java.time.LocalDateTime;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime newTime = currentTime.minusHours(2);
        System.out.println("Time 2 hours ago: " + newTime);
    }
}
