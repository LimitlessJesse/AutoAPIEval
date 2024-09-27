import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsynchronousChannelGroup_2 {
    public static void main(String[] args) throws Exception {
        // Create a new AsynchronousChannelGroup
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(Executors.newCachedThreadPool());

        // Create a new AsynchronousServerSocketChannel
        AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open(group);

        // Bind the serverChannel to a port
        serverChannel.bind(new java.net.InetSocketAddress(8080));

        // Wait for a connection
        Future<java.nio.channels.AsynchronousSocketChannel> future = serverChannel.accept();

        // Get the connected channel
        java.nio.channels.AsynchronousSocketChannel clientChannel = future.get();

        // Close the serverChannel
        serverChannel.shutdown();

        // Close the clientChannel
        clientChannel.close();

        // Shutdown the AsynchronousChannelGroup
        group.shutdown();
    }
}
