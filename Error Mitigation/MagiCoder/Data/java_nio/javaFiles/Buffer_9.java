import java.nio.ByteBuffer;

public class Buffer_9 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Remaining elements: " + buffer.remaining());
    }
}
