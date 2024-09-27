import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntry.Builder;

public class AclEntry_Builder_5 {
    public static void main(String[] args) {
        Builder builder = AclEntry.newBuilder();
        builder.setType(AclEntryType.ALLOW);
        builder.setPrincipal(UserPrincipalLookupService.lookupPrincipalByName("user:john"));
        
        AclEntry entry = builder.build();
        System.out.println("New ACL entry: " + entry);
    }
}
