import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);

        System.out.println("Before flip - position: " + buffer.position() + ", limit: " + buffer.limit());

        buffer.flip();

        System.out.println("After flip - position: " + buffer.position() + ", limit: " + buffer.limit());
    }
}
