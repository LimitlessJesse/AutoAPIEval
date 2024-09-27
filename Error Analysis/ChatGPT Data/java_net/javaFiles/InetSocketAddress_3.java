import java.net.InetSocketAddress;

public class InetSocketAddress_3 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        boolean unresolved = address.isUnresolved();
        System.out.println("Is Address unresolved: " + unresolved);
    }
}
