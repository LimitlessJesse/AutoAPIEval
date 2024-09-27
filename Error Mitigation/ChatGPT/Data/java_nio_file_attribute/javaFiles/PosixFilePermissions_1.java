import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissions_1 {
    public static void main(String[] args) {
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
        System.out.println(perms);
    }
}
