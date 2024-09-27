import java.net.InetSocketAddress;

public class InetSocketAddress_2 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        int port = address.getPort();
        System.out.println("Port: " + port);
    }
}
