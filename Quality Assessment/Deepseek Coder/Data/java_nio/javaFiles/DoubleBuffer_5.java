import java.nio.DoubleBuffer;

public class DoubleBuffer_5 {
    public static void main(String[] args) {
        DoubleBuffer originalBuffer = DoubleBuffer.allocate(5);

        originalBuffer.put(0, 1.0);
        originalBuffer.put(1, 2.0);
        originalBuffer.put(2, 3.0);
        originalBuffer.put(3, 4.0);
        originalBuffer.put(4, 5.0);

        originalBuffer.flip();

        DoubleBuffer duplicateBuffer = originalBuffer.duplicate();

        while(duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
