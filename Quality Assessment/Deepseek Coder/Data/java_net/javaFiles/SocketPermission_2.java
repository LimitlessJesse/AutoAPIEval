import java.net.SocketPermission;
import java.security.Permission;
import java.util.Set;
import java.util.Collections;

public class SocketPermission_2 {
    public static void main(String[] args) {
        SocketPermission socketPermission = new SocketPermission("localhost:1024-1025", "connect,resolve");
        Permission permission = new SocketPermission("localhost:1024-1025", "connect,resolve");
        Set<Permission> permissions = Collections.emptySet();
        permissions.add(permission);
        System.out.println(socketPermission.getActions());
    }
}
