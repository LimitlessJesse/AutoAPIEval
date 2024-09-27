import java.net.InetSocketAddress;

public class InetSocketAddress_4 {
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8080);
        int port = socketAddress.getPort();
        System.out.println("Port number: " + port);
    }
}
