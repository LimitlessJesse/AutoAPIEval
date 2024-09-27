import java.util.UUID;

public class UUID_1 {
    public static void main(String[] args) {
        String uuidString = "6ec0c128-21c1-4626-8c54-2c32c05a0105";
        UUID uuid = UUID.fromString(uuidString);
        System.out.println(uuid);
    }
}
