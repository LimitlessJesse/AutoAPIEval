import java.nio.*;

public class DoubleBuffer_4 {
    public static void main(String[] args) {
        DoubleBuffer originalBuffer = DoubleBuffer.allocate(10);

        for (int i = 0; i < originalBuffer.capacity(); i++) {
            originalBuffer.put(i, (double) i);
        }

        originalBuffer.flip();

        DoubleBuffer readOnlyBuffer = originalBuffer.asReadOnlyBuffer();

        // Modify the original buffer
        originalBuffer.put(0, 100.0);

        // Print the content of the read-only buffer
        for (int i = 0; i < readOnlyBuffer.capacity(); i++) {
            System.out.println(readOnlyBuffer.get(i));
        }
    }
}
