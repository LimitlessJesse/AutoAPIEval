import javax.net.ServerSocketFactory;

public class ServerSocketFactory_1 {
    public static void main(String[] args) {
        ServerSocketFactory factory = ServerSocketFactory.getDefault();
        System.out.println("Default ServerSocketFactory: " + factory);
    }
}
