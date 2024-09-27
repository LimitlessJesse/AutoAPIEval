import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.Selector;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public class SelectionKey_3 {
    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        channel.register(selector, SelectionKey.OP_CONNECT | SelectionKey.OP_READ);
        channel.connect(new InetSocketAddress("localhost", 8080));

        while(true) {
            selector.select();
            for (SelectionKey key : selector.selectedKeys()) {
                if (key.isConnectable()) {
                    channel.finishConnect();
                    System.out.println("Connection established");
                } else if (key.isReadable()) {
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int numRead = channel.read(buffer);
                    if (numRead == -1) {
                        System.out.println("Connection closed");
                        key.cancel();
                    } else {
                        System.out.println("Read " + numRead + " bytes");
                    }
                }
            }
            selector.selectedKeys().clear();
        }
    }
}
