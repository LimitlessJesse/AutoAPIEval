import java.nio.CharBuffer;

public class CharBuffer_4 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.put("Hello");
        buffer.flip(); // Flipping to prepare for reading

        System.out.println("Before compact:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }

        buffer.compact(); // Compacting the buffer

        buffer.put(" World");
        buffer.flip(); // Flipping again to prepare for reading

        System.out.println("\nAfter compact:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }
    }
}
