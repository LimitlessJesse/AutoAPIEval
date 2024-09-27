import java.time.Instant;

public class Instant_4 {
    public static void main(String[] args) {
        Instant instant1 = Instant.parse("2022-01-01T00:00:00Z");
        Instant instant2 = Instant.parse("2022-01-02T00:00:00Z");
        
        boolean isAfter = instant2.isAfter(instant1);
        System.out.println("Is instant2 after instant1? " + isAfter);
    }
}
