import java.time.OffsetDateTime;

public class OffsetDateTime_4 {
    public static void main(String[] args) {
        OffsetDateTime dt = OffsetDateTime.now();
        OffsetDateTime newDt = dt.withHour(15); // Set the hour to 15
        System.out.println("Original OffsetDateTime: " + dt);
        System.out.println("Modified OffsetDateTime with hour set to 15: " + newDt);
    }
}
