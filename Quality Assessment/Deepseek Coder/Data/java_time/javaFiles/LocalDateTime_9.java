import java.time.LocalDateTime;

public class LocalDateTime_9 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int nano = now.getNano();
        System.out.println("Nano: " + nano);
    }
}
