import java.time.LocalDateTime;

public class LocalDateTime_10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int nano = dateTime.getNano();
        System.out.println("Nano of second: " + nano);
    }
}
