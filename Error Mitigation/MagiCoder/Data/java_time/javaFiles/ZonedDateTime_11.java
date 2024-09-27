import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_11 {
    public static void main(String[] args) {
        // Create a ZonedDateTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));

        // Add 5 years to the ZonedDateTime
        ZonedDateTime newZonedDateTime = zonedDateTime.plusYears(5);

        // Print the new ZonedDateTime
        System.out.println("Original ZonedDateTime: " + zonedDateTime);
        System.out.println("ZonedDateTime after adding 5 years: " + newZonedDateTime);
    }
}
