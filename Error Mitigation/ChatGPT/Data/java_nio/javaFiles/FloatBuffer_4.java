import java.nio.FloatBuffer;

public class FloatBuffer_4 {
    public static void main(String[] args) {
        FloatBuffer floatBuffer = FloatBuffer.allocate(10);
        floatBuffer.put(3.14f);
        floatBuffer.flip();
        
        float value = floatBuffer.get();
        System.out.println("Value retrieved from FloatBuffer: " + value);
    }
}
