import java.nio.IntBuffer;

public class IntBuffer_11 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        for (int i = 0; i < 5; i++) {
            buffer.put(i);
        }

        buffer.flip();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }

        buffer.compact();

        buffer.flip();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }
}
