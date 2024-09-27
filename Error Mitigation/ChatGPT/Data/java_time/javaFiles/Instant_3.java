import java.time.Instant;

public class Instant_3 {
    public static void main(String[] args) {
        Instant instant1 = Instant.ofEpochSecond(3, 1);
        Instant instant2 = Instant.ofEpochSecond(4, -999_999_999);
        Instant instant3 = Instant.ofEpochSecond(2, 1000_000_001);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
    }
}
