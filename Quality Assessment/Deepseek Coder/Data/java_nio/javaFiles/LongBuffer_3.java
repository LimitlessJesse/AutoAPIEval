import java.nio.*;

public class LongBuffer_3 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(5);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((long)(i * 3.7));
        }

        // flip buffer to read mode
        buffer.flip();

        // read elements from buffer
        while(buffer.hasRemaining()) {
            System.out.println("Element: " + buffer.get());
        }
    }
}
