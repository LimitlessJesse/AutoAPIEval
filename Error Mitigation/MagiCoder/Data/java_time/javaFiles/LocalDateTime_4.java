import java.time.LocalDateTime;

public class LocalDateTime_4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int year = dateTime.getYear();
        System.out.println("Current Year: " + year);
    }
}
