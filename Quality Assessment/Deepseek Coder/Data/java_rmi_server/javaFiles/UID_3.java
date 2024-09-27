import java.util.UUID;

public class UID_3 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID: " + uuid);
        System.out.println("Hash Code: " + uuid.hashCode());
    }
}
