import java.nio.DoubleBuffer;

public class DoubleBuffer_5 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(1.0);
        buffer.put(2.0);
        buffer.put(3.0);
        System.out.println("Buffer before compact: " + buffer);

        buffer.flip();
        buffer.compact();
        System.out.println("Buffer after compact: " + buffer);
    }
}
