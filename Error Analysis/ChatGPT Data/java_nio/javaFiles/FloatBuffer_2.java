import java.nio.FloatBuffer;
import java.nio.ByteBuffer;

public class FloatBuffer_2 {
    public static void main(String[] args) {
        FloatBuffer floatBuffer = FloatBuffer.allocate(4);
        floatBuffer.put(1.0f);
        floatBuffer.put(2.0f);
        floatBuffer.put(3.0f);
        floatBuffer.put(4.0f);

        floatBuffer.rewind();
        float firstValue = floatBuffer.get();
        float secondValue = floatBuffer.get();
        
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
    }
}
