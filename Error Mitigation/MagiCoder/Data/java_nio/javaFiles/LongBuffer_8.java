import java.nio.LongBuffer;

public class LongBuffer_8 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);

        for (int i = 0; i < 5; i++) {
            buffer.put(i);
        }

        buffer.flip();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }

        buffer.compact();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }
}
