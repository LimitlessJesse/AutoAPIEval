import java.nio.LongBuffer;

public class LongBuffer_10 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        for (long i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
