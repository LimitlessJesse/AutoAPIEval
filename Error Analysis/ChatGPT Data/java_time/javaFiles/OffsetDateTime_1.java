import java.time.OffsetDateTime;

public class OffsetDateTime_1 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        int hour = offsetDateTime.getHour();
        System.out.println("Current hour: " + hour);
    }
}
