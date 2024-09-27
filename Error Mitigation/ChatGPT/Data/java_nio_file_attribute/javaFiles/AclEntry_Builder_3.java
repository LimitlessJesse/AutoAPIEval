import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.util.HashSet;
import java.util.Set;

public class AclEntry_Builder_3 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        Set<AclEntryPermission> permissions = new HashSet<>();
        permissions.add(AclEntryPermission.READ_DATA);
        permissions.add(AclEntryPermission.WRITE_DATA);
        
        AclEntry.Builder updatedBuilder = builder.setPermissions(permissions);
        
        System.out.println("Permissions set: " + updatedBuilder.permissions());
    }
}
