import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_2 {
    public static void main(String[] args) {
        try {
            // Create a new DatagramChannel
            DatagramChannel channel = DatagramChannel.open();

            // Bind the channel to a specific port
            channel.bind(new InetSocketAddress(5000));

            // Create a ByteBuffer to hold the incoming data
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read data from the channel
            channel.read(buffer);

            // Flip the buffer to prepare for reading
            buffer.flip();

            // Convert the buffer to a string and print it
            String message = new String(buffer.array(), 0, buffer.limit());
            System.out.println("Received message: " + message);

            // Close the channel
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
