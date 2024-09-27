import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_2 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("example.com", 80));

            ByteBuffer src1 = ByteBuffer.wrap("First ByteBuffer".getBytes());
            ByteBuffer src2 = ByteBuffer.wrap("Second ByteBuffer".getBytes());

            // Write data from multiple ByteBuffer to SocketChannel
            ByteBuffer[] srcs = {src1, src2};
            long bytesWritten = socketChannel.write(srcs);

            System.out.println("Bytes written: " + bytesWritten);

            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
