import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

public class PosixFilePermissions_2 {
    public static void main(String[] args) {
        Set<PosixFilePermission> permissions = new HashSet<>();
        permissions.add(PosixFilePermission.OWNER_READ);
        permissions.add(PosixFilePermission.OWNER_WRITE);
        
        String permissionString = PosixFilePermissions.toString(permissions);
        System.out.println(permissionString);
    }
}
