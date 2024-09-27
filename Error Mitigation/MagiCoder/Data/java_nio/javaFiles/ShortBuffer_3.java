import java.nio.ShortBuffer;

public class ShortBuffer_3 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        for (short i = 0; i < 10; i++) {
            buffer.put(i);
        }
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
