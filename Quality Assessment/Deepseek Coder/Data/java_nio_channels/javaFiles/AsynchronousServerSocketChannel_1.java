import java.io.IOException;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AsynchronousServerSocketChannel_1 {
    public static void main(String[] args) {
        try {
            AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open();
            System.out.println("AsynchronousServerSocketChannel opened successfully: " + serverSocketChannel.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
