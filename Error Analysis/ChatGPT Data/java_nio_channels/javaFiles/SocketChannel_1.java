import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannel_1 {
    public static void main(String[] args) {
        // Create a new ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(48);
        
        // Open a SocketChannel
        try (SocketChannel socketChannel = SocketChannel.open()) {
            // Connect to a server
            socketChannel.connect(new java.net.InetSocketAddress("www.google.com", 80));
            
            // Read data from the SocketChannel into the ByteBuffer
            int bytesRead = socketChannel.read(buffer);
            
            // Print the number of bytes read
            System.out.println("Bytes read: " + bytesRead);
            
            // Print the content of the ByteBuffer
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
