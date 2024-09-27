import java.nio.LongBuffer;

public class LongBuffer_13 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (long) i);
        }
        buffer.flip();
        LongBuffer slice = buffer.slice();
        for (int i = 0; i < slice.capacity(); i++) {
            System.out.println(slice.get(i));
        }
    }
}
