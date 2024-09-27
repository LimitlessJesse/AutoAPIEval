import java.time.OffsetDateTime;

public class OffsetDateTime_2 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        int minute = dateTime.getMinute();
        System.out.println("Current minute: " + minute);
    }
}
