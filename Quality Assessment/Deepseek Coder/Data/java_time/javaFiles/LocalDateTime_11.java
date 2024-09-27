import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTime_11 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("LocalDate: " + localDate);
    }
}
