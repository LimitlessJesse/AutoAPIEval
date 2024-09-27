import java.nio.LongBuffer;

public class LongBuffer_5 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (long) i);
        }
        buffer.flip();
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.println(buffer.get(i));
        }
    }
}
