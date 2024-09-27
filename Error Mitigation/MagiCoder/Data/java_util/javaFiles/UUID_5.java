import java.util.UUID;

public class UUID_5 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        try {
            long timestamp = uuid.timestamp();
            System.out.println("Timestamp: " + timestamp);
        } catch (UnsupportedOperationException e) {
            System.out.println("This UUID is not a version 1 UUID");
        }
    }
}
