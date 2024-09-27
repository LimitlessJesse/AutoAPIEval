import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryType;

public class AclEntry_Builder_3 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        AclEntry entry = builder.setType(AclEntryType.ALLOW).build();
        System.out.println("AclEntry type: " + entry.type());
    }
}
