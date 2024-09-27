import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.GroupPrincipal;
import java.util.Set;
import java.util.EnumSet;

public class AclEntry_Builder_5 {
    public static void main(String[] args) {
        UserPrincipal userPrincipal = null; // replace with actual UserPrincipal
        GroupPrincipal groupPrincipal = null; // replace with actual GroupPrincipal
        Set<AclEntryPermission> permissions = EnumSet.of(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA);
        Set<AclEntryFlag> flags = EnumSet.of(AclEntryFlag.INHERIT_ONLY);
        AclEntryType type = AclEntryType.ALLOW;

        AclEntry.Builder builder = AclEntry.newBuilder();
        AclEntry aclEntry = builder
               .setType(type)
               .setPermissions(permissions)
               .setFlags(flags)
               .setUser(userPrincipal)
               .setGroup(groupPrincipal)
               .build();

        System.out.println(aclEntry);
    }
}
