import java.nio.ShortBuffer;

public class ShortBuffer_4 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((short) i);
        }

        ShortBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println("Read-only buffer: " + readOnlyBuffer);

        // This will throw an exception
        readOnlyBuffer.put((short) 11, (short) 12);
    }
}
