import java.net.SocketPermission;

public class SocketPermission_2 {
    public static void main(String[] args) {
        SocketPermission socketPermission = new SocketPermission("*", "connect, listen, accept, resolve");
        String actions = socketPermission.getActions();
        System.out.println(actions);
    }
}
