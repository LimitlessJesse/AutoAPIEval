import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.Selector;
import java.net.InetSocketAddress;
import java.io.IOException;

public class SelectionKey_1 {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        channel.connect(new InetSocketAddress("www.google.com", 80));
        channel.register(selector, SelectionKey.OP_CONNECT);

        while(true) {
            selector.select();
            for (SelectionKey key : selector.selectedKeys()) {
                if (key.isConnectable()) {
                    SocketChannel channel1 = (SocketChannel) key.channel();
                    if (channel1.isConnectionPending()) {
                        channel1.finishConnect();
                    }
                    channel1.configureBlocking(false);
                    channel1.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    SocketChannel channel1 = (SocketChannel) key.channel();
                    System.out.println("Readable: " + channel1.getRemoteAddress());
                }
            }
            selector.selectedKeys().clear();
        }
    }
}
