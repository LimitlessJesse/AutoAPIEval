import java.nio.DoubleBuffer;

public class DoubleBuffer_4 {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5};
        DoubleBuffer buffer = DoubleBuffer.wrap(array);

        DoubleBuffer slicedBuffer = buffer.slice();
        System.out.println("Original Buffer:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }

        System.out.println("\nSliced Buffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.print(slicedBuffer.get() + " ");
        }
    }
}
