import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class AclEntry_Builder_4 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/path/to/file");
        AclFileAttributeView aclView = Files.getFileAttributeView(path, AclFileAttributeView.class);

        AclEntry.Builder builder = aclView.getAcl(0).get(0).getBuilder();
        builder.setType(AclEntryType.ALLOW);

        // Add the modified ACL entry back to the list
        aclView.setAcl(aclView.getAcl().size(), builder.build());
    }
}
