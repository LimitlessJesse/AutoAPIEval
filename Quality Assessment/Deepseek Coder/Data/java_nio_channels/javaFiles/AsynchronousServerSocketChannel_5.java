import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AsynchronousServerSocketChannel_5 {
    public static void main(String[] args) throws IOException {
        AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(8080));

        serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
            @Override
            public void completed(AsynchronousSocketChannel result, Void attachment) {
                System.out.println("Client connected");
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
                System.out.println("Failed to accept client");
            }
        });

        // Keep the program running
        try { Thread.currentThread().join(); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
