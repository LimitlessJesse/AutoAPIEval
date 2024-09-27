import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class Channels_2 {
    public static void main(String[] args) {
        OutputStream outputStream = System.out;
        WritableByteChannel channel = Channels.newChannel(outputStream);
        
        try {
            channel.write(java.nio.ByteBuffer.wrap("Hello, World!".getBytes()));
            channel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
