import java.nio.ShortBuffer;

public class ShortBuffer_3 {
    public static void main(String[] args) {
        ShortBuffer originalBuffer = ShortBuffer.allocate(5);
        originalBuffer.put(new short[]{1, 2, 3, 4, 5});
        originalBuffer.position(1);
        originalBuffer.limit(4);

        ShortBuffer slicedBuffer = originalBuffer.slice();

        System.out.println("Original Buffer:");
        while (originalBuffer.hasRemaining()) {
            System.out.print(originalBuffer.get() + " ");
        }

        System.out.println("\nSliced Buffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.print(slicedBuffer.get() + " ");
        }
    }
}
