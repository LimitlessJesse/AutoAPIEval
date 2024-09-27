import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissions_2 {
    public static void main(String[] args) {
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
        String permString = PosixFilePermissions.toString(perms);
        System.out.println(permString);
    }
}
