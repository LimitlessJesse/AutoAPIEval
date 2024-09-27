import java.time.LocalDateTime;

public class LocalDateTime_4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before: " + dateTime);
        
        LocalDateTime modifiedDateTime = dateTime.withYear(2022);
        System.out.println("After modifying year: " + modifiedDateTime);
    }
}
