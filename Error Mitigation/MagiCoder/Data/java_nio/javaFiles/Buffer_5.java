import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_5 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Original limit: " + buffer.limit());

        buffer.limit(5);
        System.out.println("New limit: " + buffer.limit());
    }
}
