import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissions_1 {
    public static void main(String[] args) {
        String perms = "rw-r--r--";
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perms);
        System.out.println(permissions);
    }
}
