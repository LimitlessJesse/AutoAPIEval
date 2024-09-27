import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.util.HashSet;
import java.util.Set;

public class AclEntry_Builder_4 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        Set<AclEntryFlag> flags = new HashSet<>();
        flags.add(AclEntryFlag.FILE_INHERIT);
        flags.add(AclEntryFlag.DIRECTORY_INHERIT);
        
        builder.setFlags(flags);
        
        AclEntry aclEntry = builder.build();
        
        System.out.println("AclEntry flags set: " + aclEntry.flags());
    }
}
