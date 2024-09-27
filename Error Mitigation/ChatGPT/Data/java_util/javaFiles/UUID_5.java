import java.util.UUID;

public class UUID_5 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        int version = uuid.version();
        System.out.println("UUID Version: " + version);
    }
}
