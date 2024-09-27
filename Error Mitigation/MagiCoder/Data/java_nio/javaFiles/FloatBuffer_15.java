import java.nio.FloatBuffer;

public class FloatBuffer_15 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (float) i);
        }

        buffer.flip();

        FloatBuffer slice = buffer.slice();

        for (int i = 0; i < slice.capacity(); i++) {
            System.out.println(slice.get(i));
        }
    }
}
