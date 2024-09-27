import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectionKey_5 {
    public static void main(String[] args) throws Exception {
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
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                if (key.isValid()) {
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
                        // Read data from the channel
                    }
                    if (key.isWritable()) {
                        SocketChannel client = (SocketChannel) key.channel();
                        // Write data to the channel
                    }
                }
                iterator.remove();
            }
        }
    }
}
