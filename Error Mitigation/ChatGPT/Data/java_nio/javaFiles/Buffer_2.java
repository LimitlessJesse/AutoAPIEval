import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_2 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        System.out.println("Before clear: " + buffer);

        buffer.clear();
        System.out.println("After clear: " + buffer);
    }
}
