import java.nio.channels.SocketChannel;
import java.io.IOException;

public class SocketChannel_5 {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;
        try {
            boolean isConnectionEstablished = socketChannel.finishConnect();
            if(isConnectionEstablished) {
                System.out.println("Connection established successfully");
            } else {
                System.out.println("Connection not established");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
