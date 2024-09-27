import java.net.SocketPermission;

public class SocketPermission_5 {
    public static void main(String[] args) {
        SocketPermission socketPermission = new SocketPermission("", "connect,resolve");
        int hashCode = socketPermission.hashCode();
        System.out.println("Hash code of SocketPermission: " + hashCode);
    }
}
