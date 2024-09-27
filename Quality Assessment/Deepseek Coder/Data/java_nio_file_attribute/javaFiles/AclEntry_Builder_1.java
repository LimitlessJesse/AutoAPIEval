import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.util.Set;
import java.util.HashSet;

public class AclEntry_Builder_1 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();

        // Create a set of permissions
        Set<AclEntryPermission> permissions = new HashSet<>();
        permissions.add(AclEntryPermission.READ_DATA);
        permissions.add(AclEntryPermission.WRITE_DATA);

        // Set the permissions
        builder.setPermissions(permissions);

        // Get the AclEntry
        AclEntry entry = builder.build();

        // Print the permissions
        System.out.println(entry.permissions());
    }
}
