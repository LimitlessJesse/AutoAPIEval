import java.time.LocalDateTime;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        System.out.println("Current Year: " + year);
    }
}
