import java.util.UUID;

public class UUID_2 {
    public static void main(String[] args) {
        byte[] name = "example".getBytes();
        UUID uuid = UUID.nameUUIDFromBytes(name);
        System.out.println("Generated UUID: " + uuid.toString());
    }
}
