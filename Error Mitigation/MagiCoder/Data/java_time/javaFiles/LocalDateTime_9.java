import java.time.LocalDateTime;

public class LocalDateTime_9 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int second = dateTime.getSecond();
        System.out.println("The second is: " + second);
    }
}
