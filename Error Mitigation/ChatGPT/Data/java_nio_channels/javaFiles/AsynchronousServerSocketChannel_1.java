import java.io.IOException;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AsynchronousServerSocketChannel_1 {
    public static void main(String[] args) {
        try {
            AsynchronousServerSocketChannel channel = AsynchronousServerSocketChannel.open();
            System.out.println("Asynchronous server socket channel opened successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
