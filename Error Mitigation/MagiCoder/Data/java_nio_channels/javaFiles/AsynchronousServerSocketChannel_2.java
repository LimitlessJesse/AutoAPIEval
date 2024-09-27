import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AsynchronousServerSocketChannel_2 {
    public static void main(String[] args) {
        try (AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()) {
            InetSocketAddress isa = new InetSocketAddress("localhost", 8080);
            serverChannel.bind(isa);
            System.out.println("Server is listening on port " + isa.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
