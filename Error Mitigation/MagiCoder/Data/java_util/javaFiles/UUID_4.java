import java.util.UUID;

public class UUID_4 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        System.out.println(uuidString);
    }
}
