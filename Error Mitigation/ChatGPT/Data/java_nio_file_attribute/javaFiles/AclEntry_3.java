import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.util.Set;

public class AclEntry_3 {
    public static void main(String[] args) {
        AclEntry aclEntry = ...; // Initialize AclEntry object
        Set<AclEntryFlag> flags = aclEntry.flags();
        System.out.println(flags);
    }
}
