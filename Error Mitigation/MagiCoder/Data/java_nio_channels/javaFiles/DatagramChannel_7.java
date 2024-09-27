import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_7 {
    public static void main(String[] args) {
        try (DatagramChannel channel = DatagramChannel.open()) {
            channel.bind(new InetSocketAddress(9999));
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            InetSocketAddress remoteAddress = (InetSocketAddress) channel.receive(buffer);
            if (remoteAddress!= null) {
                System.out.println("Received data from " + remoteAddress);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
