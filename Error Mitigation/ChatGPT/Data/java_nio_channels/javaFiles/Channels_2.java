import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class Channels_2 {
    public static void main(String[] args) {
        OutputStream outputStream = System.out; // Example output stream
        WritableByteChannel channel = Channels.newChannel(outputStream);
        
        try {
            channel.write(java.nio.ByteBuffer.wrap("Hello, World!".getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
