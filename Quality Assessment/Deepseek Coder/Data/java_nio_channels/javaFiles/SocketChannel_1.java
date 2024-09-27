import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_1 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("example.com", 80));

            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytesRead = socketChannel.read(buffer);

            while (bytesRead!= -1) {
                System.out.println("Read " + bytesRead);
                buffer.flip();

                while(buffer.hasRemaining()){
                    System.out.print((char) buffer.get());
                }

                buffer.clear();
                bytesRead = socketChannel.read(buffer);
            }

            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
