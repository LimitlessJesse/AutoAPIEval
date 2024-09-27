import java.net.SocketPermission;

public class SocketPermission_3 {
    public static void main(String[] args) {
        SocketPermission permission1 = new SocketPermission("www.example.com:80", "connect");
        SocketPermission permission2 = new SocketPermission("www.example.com:8080", "connect,accept");

        boolean result1 = permission1.implies(permission2);
        boolean result2 = permission2.implies(permission1);

        System.out.println("Permission1 implies Permission2: " + result1);
        System.out.println("Permission2 implies Permission1: " + result2);
    }
}
