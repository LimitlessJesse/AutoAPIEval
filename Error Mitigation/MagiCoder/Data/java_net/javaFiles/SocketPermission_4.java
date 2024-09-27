import java.net.SocketPermission;
import java.security.Permission;

public class SocketPermission_4 {
    public static void main(String[] args) {
        SocketPermission sp1 = new SocketPermission("localhost:1024-65535", "connect,resolve");
        SocketPermission sp2 = new SocketPermission("localhost:1024-65535", "connect");
        System.out.println(sp1.implies(sp2)); // prints: true
    }
}
