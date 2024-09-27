import java.time.LocalDateTime;

public class LocalDateTime_2 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(5);
        System.out.println("Future DateTime after adding 5 days: " + futureDateTime);
    }
}
