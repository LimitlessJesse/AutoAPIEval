import java.time.OffsetDateTime;

public class OffsetDateTime_3 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        int second = offsetDateTime.getSecond();
        System.out.println("Second: " + second);
    }
}
