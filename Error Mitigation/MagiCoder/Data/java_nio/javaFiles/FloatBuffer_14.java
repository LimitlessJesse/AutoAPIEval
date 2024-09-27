import java.nio.FloatBuffer;

public class FloatBuffer_14 {
    public static void main(String[] args) {
        FloatBuffer originalBuffer = FloatBuffer.allocate(5);
        originalBuffer.put(new float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f});
        originalBuffer.flip();

        FloatBuffer duplicateBuffer = originalBuffer.duplicate();

        while(duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
