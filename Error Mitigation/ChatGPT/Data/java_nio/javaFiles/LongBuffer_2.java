import java.nio.LongBuffer;

public class LongBuffer_2 {
    public static void main(String[] args) {
        long[] src = {1L, 2L, 3L, 4L, 5L};
        LongBuffer buffer = LongBuffer.allocate(5);
        buffer.put(src);
        
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
