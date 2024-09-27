import java.util.UUID;

public class UUID_3 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        long mostSignificantBits = uuid.getMostSignificantBits();
        System.out.println("Most Significant Bits: " + mostSignificantBits);
    }
}
