import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Channels_1 {
    public static void main(String[] args) {
        String data = "This is a test input stream";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data.getBytes());
        
        try {
            ReadableByteChannel channel = Channels.newChannel(inputStream);
            byte[] buffer = new byte[data.length()];
            channel.read(java.nio.ByteBuffer.wrap(buffer));
            System.out.println(new String(buffer));
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
