import java.security.Permission;
import java.net.SocketPermission;

public class SocketPermission_3 {
    public static void main(String[] args) {
        SocketPermission socketPermission1 = new SocketPermission("localhost:1024-", "connect,resolve");
        SocketPermission socketPermission2 = new SocketPermission("localhost:1025-", "connect,resolve");

        boolean implies1 = socketPermission1.implies(socketPermission2);
        boolean implies2 = socketPermission2.implies(socketPermission1);

        System.out.println(implies1); // Output: false
        System.out.println(implies2); // Output: true
    }
}
