import java.nio.FloatBuffer;

public class FloatBuffer_13 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((float) i);
        }

        buffer.flip();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get(i));
        }

        buffer.compact();

        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get(i));
        }
    }
}
