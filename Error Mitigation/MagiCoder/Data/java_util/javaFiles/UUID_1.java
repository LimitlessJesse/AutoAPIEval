import java.util.UUID;

public class UUID_1 {
    public static void main(String[] args) {
        String uuidString = "123e4567-e89b-12d3-a456-426655440000";
        UUID uuid = UUID.fromString(uuidString);
        System.out.println(uuid);
    }
}
