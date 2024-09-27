import java.net.SocketPermission;

public class SocketPermission_5 {
    public static void main(String[] args) {
        SocketPermission sp1 = new SocketPermission("*", "connect,resolve");
        SocketPermission sp2 = new SocketPermission("*", "connect,resolve");
        SocketPermission sp3 = new SocketPermission("*", "connect");

        System.out.println(sp1.equals(sp2)); // true
        System.out.println(sp1.equals(sp3)); // false
    }
}
