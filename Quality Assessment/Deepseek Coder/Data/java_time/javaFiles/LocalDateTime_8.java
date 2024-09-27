import java.time.LocalDateTime;

public class LocalDateTime_8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int second = now.getSecond();
        System.out.println("The current second is: " + second);
    }
}
