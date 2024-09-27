import java.net.StandardSocketOptions;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketOption;
import java.io.IOException;

public class ServerSocketChannel_5 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            SocketOption<Boolean> soReuseAddr = StandardSocketOptions.SO_REUSEADDR;
            serverSocketChannel.setOption(soReuseAddr, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
