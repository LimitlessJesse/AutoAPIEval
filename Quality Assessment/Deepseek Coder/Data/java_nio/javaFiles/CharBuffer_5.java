import java.nio.CharBuffer;

public class CharBuffer_5 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((char) ('A' + i));
        }
        buffer.flip();

        // duplicate the buffer
        CharBuffer duplicateBuffer = buffer.duplicate();

        // print the original buffer
        System.out.println("Original buffer:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }
        System.out.println();

        // print the duplicate buffer
        System.out.println("Duplicate buffer:");
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get());
        }
        System.out.println();
    }
}
