import java.net.InetSocketAddress;

public class InetSocketAddress_4 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("example.com", 80);
        boolean unresolved = address.isUnresolved();
        System.out.println("Is address unresolved? " + unresolved);
    }
}
