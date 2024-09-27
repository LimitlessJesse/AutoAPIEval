import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.AlreadyBoundException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.channels.ClosedChannelException;

public class AsynchronousServerSocketChannel_2 {
    public static void main(String[] args) {
        try {
            AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open();
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            serverSocketChannel.bind(address);
            System.out.println("Server socket bound to address: " + address);
        } catch (IOException | AlreadyBoundException | UnsupportedAddressTypeException | ClosedChannelException e) {
            e.printStackTrace();
        }
    }
}
