import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.UnsupportedAddressTypeException;

public class AsynchronousSocketChannel_3 {
    public static void main(String[] args) {
        try {
            AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            channel.bind(address);
            System.out.println("Socket bound to address: " + address);
        } catch (IOException | UnsupportedAddressTypeException e) {
            e.printStackTrace();
        }
    }
}
