import java.net.SocketPermission;

public class SocketPermission_2 {
    public static void main(String[] args) {
        SocketPermission permission = new SocketPermission("localhost:8080", "connect, resolve");
        String actions = permission.getActions();
        System.out.println("Actions permitted: " + actions);
    }
}
