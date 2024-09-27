import java.nio.CharBuffer;

public class CharBuffer_4 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((char) ('a' + i));
        }

        buffer.flip();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.print(buffer.get());
        }

        System.out.println();

        buffer.compact();

        for (int i = 0; i < buffer.position(); i++) {
            System.out.print(buffer.get());
        }
    }
}
