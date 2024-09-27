import java.net.InetSocketAddress;

public class InetSocketAddress_2 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("example.com", 80);
        String hostname = address.getHostName();
        System.out.println("Hostname: " + hostname);
    }
}
