import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.util.HashSet;
import java.util.Set;

public class AclEntry_Builder_2 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        Set<AclEntryPermission> permissions = new HashSet<>();
        permissions.add(AclEntryPermission.READ_DATA);
        permissions.add(AclEntryPermission.WRITE_DATA);
        
        builder.setPermissions(permissions);
        
        AclEntry aclEntry = builder.build();
        
        System.out.println("AclEntry permissions: " + aclEntry.permissions());
    }
}
