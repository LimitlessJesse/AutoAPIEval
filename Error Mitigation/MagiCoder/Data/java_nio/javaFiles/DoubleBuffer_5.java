import java.nio.DoubleBuffer;

public class DoubleBuffer_5 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(10);

        for (int i = 0; i < 5; i++) {
            buffer.put(i * 1.0);
        }

        buffer.position(3);
        buffer.limit(7);

        System.out.println("Before compact():");
        printBuffer(buffer);

        buffer.compact();

        System.out.println("After compact():");
        printBuffer(buffer);
    }

    private static void printBuffer(DoubleBuffer buffer) {
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
        buffer.clear();
    }
}
