import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.io.IOException;

public class DatagramChannel_4 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytesRead = channel.read(buffer);
            
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
