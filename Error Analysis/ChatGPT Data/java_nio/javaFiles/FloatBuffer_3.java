import java.nio.FloatBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FloatBuffer_3 {
    public static void main(String[] args) {
        float[] data = {1.0f, 2.0f, 3.0f, 4.0f};
        FloatBuffer floatBuffer = FloatBuffer.allocate(data.length);
        floatBuffer.put(data);
        
        System.out.println("Original FloatBuffer: " + floatBuffer.toString());
        
        Buffer compactBuffer = floatBuffer.compact();
        
        System.out.println("Compacted FloatBuffer: " + compactBuffer.toString());
    }
}
