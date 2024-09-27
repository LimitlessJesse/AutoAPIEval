import java.util.UUID;

public class UUID_5 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        long msb = uuid.getMostSignificantBits();
        System.out.println(msb);
    }
}
