import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_5 {
    public static void main(String[] args) {
        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.bind(new InetSocketAddress(8080));

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            channel.receive(buffer);

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
