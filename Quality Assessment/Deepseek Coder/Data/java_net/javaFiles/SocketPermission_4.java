import java.net.SocketPermission;

public class SocketPermission_4 {
    public static void main(String[] args) {
        SocketPermission sp1 = new SocketPermission("", "connect,resolve");
        SocketPermission sp2 = new SocketPermission("", "connect,resolve");

        boolean isEqual = sp1.equals(sp2);
        System.out.println(isEqual);
    }
}
