import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryType;

public class AclEntry_Builder_2 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        AclEntryType type = AclEntryType.ALLOW;
        builder.setType(type);
    }
}
