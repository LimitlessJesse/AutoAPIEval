import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Channels_1 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        ReadableByteChannel channel = Channels.newChannel(inputStream);
        System.out.println(channel);
    }
}
