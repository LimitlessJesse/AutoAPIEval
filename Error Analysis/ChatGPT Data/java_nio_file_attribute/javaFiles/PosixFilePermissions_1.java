import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class PosixFilePermissions_1 {
    public static void main(String[] args) {
        String perms = "rwxr-x---";
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perms);
        
        System.out.println("Permissions: " + permissions);
    }
}
