import java.util.UUID;

public class UUID_4 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        System.out.println(leastSignificantBits);
    }
}
