import java.util.UUID;

public class UUID_5 {
    public static void main(String[] args) {
        UUID uuid1 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
        UUID uuid2 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

        int comparison = uuid1.compareTo(uuid2);
        if (comparison == 0) {
            System.out.println("UUIDs are equal");
        } else if (comparison < 0) {
            System.out.println("UUID1 is less than UUID2");
        } else {
            System.out.println("UUID1 is greater than UUID2");
        }
    }
}
