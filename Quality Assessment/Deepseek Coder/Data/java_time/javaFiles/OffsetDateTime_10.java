import java.time.OffsetDateTime;

public class OffsetDateTime_10 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        long years = 5;
        OffsetDateTime newDateTime = dateTime.minusYears(years);
        System.out.println("OffsetDateTime after subtracting " + years + " year(s): " + newDateTime);
    }
}
