import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.spi.AsynchronousChannelProvider;

public class AsynchronousChannelProvider_3 {
    public static void main(String[] args) {
        try {
            AsynchronousChannelGroup group = AsynchronousChannelProvider.provider().openAsynchronousChannelGroup(1, null);
            AsynchronousServerSocketChannel channel = AsynchronousChannelProvider.provider().openAsynchronousServerSocketChannel(group);
            System.out.println("Asynchronous server socket channel opened successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
