import java.nio.FloatBuffer;

public class FloatBuffer_2 {
    public static void main(String[] args) {
        float[] array = {1.1f, 2.2f, 3.3f};
        FloatBuffer buffer = FloatBuffer.wrap(array);
        
        System.out.println("Buffer capacity: " + buffer.capacity());
        System.out.println("Buffer limit: " + buffer.limit());
        System.out.println("Buffer position: " + buffer.position());
        
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println("Element at index " + i + ": " + buffer.get(i));
        }
    }
}
