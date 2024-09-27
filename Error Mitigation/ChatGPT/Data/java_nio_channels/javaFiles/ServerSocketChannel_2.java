import java.nio.channels.ServerSocketChannel;
import java.net.ServerSocket;

public class ServerSocketChannel_2 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            ServerSocket serverSocket = serverSocketChannel.socket();
            System.out.println("Server socket associated with channel: " + serverSocket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
