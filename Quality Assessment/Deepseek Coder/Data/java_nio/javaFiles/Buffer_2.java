import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_2 {
    public static void main(String[] args) {
        // Create a byte buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        // Put some data into the buffer
        byteBuffer.put((byte)1);
        byteBuffer.put((byte)2);
        byteBuffer.put((byte)3);

        // Print the buffer before flip
        System.out.println("Buffer before flip: " + byteBuffer);

        // Flip the buffer
        byteBuffer.flip();

        // Print the buffer after flip
        System.out.println("Buffer after flip: " + byteBuffer);
    }
}
