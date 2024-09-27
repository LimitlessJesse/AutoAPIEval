import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Format_2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String formattedDateTime = now.format(formatter);

        System.out.println(formattedDateTime);
    }
}
