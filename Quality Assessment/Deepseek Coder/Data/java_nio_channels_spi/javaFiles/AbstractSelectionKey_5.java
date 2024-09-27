import java.nio.channels.spi.AbstractSelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.io.IOException;

public class AbstractSelectionKey_5 {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        AbstractSelectionKey key = channel.register(selector, 0);

        boolean isValid = key.isValid();
        System.out.println("Is key valid? " + isValid);

        channel.close();
        isValid = key.isValid();
        System.out.println("Is key valid after channel close? " + isValid);
    }
}
