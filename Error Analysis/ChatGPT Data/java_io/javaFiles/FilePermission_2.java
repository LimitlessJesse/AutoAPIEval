import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermission_2 {
    public static void main(String[] args) {
        FilePermission filePermission = new FilePermission("/path/to/file", "read");
        PermissionCollection permissionCollection = filePermission.newPermissionCollection();
        permissionCollection.add(filePermission);
        
        System.out.println(filePermission.getActions());
    }
}
