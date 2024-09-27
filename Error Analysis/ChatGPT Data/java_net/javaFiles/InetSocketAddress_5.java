import java.net.InetSocketAddress;

public class InetSocketAddress_5 {
    public static void main(String[] args) {
        InetSocketAddress address = InetSocketAddress.createUnresolved("localhost", 8080);
        System.out.println(address);
    }
}
