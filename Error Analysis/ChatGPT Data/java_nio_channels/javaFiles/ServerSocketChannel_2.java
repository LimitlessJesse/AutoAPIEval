import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannel_2 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            int ops = serverSocketChannel.validOps();
            System.out.println("Valid operations for ServerSocketChannel: " + ops);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
