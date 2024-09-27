import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_4 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.connect(new InetSocketAddress("localhost", 8080));
            
            ByteBuffer buffer = ByteBuffer.allocate(48);
            buffer.put("Hello, World!".getBytes());
            buffer.flip();
            
            int bytesWritten = channel.write(buffer);
            System.out.println("Number of bytes written: " + bytesWritten);
            
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
