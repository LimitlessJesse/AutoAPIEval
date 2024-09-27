import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectionKey_2 {
    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();

                if (key.isAcceptable()) {
                    SocketChannel client = serverSocketChannel.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    // Read data from the client
                    //...
                    // After reading, we can change the interest set
                    key.interestOps(SelectionKey.OP_WRITE);
                } else if (key.isWritable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    // Write data to the client
                    //...
                    // After writing, we can change the interest set
                    key.interestOps(SelectionKey.OP_READ);
                }

                iterator.remove();
            }
        }
    }
}
