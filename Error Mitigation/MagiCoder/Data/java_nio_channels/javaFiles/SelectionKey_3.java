import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.Selector;
import java.io.IOException;

public class SelectionKey_3 {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(null);
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        while (true) {
            selector.select();
            for (SelectionKey key : selector.selectedKeys()) {
                if (key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel client = server.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                }
                if (key.isConnectable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    if (client.isConnectionPending()) {
                        client.finishConnect();
                    }
                    client.register(selector, SelectionKey.OP_WRITE);
                }
                if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    System.out.println("Channel: " + key.channel());
                }
                if (key.isWritable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    System.out.println("Channel: " + key.channel());
                }
                key.interestOps(0);
            }
            selector.selectedKeys().clear();
        }
    }
}
