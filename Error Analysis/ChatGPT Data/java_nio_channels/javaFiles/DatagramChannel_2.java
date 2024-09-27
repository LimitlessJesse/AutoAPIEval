import java.io.IOException;
import java.nio.ByteBuffer;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_2 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            
            // Receive data into the buffer from the channel's socket address
            channel.receive(buffer);
            
            // Reset the buffer's position to read data
            buffer.flip();
            
            // Print data received from the socket address
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
