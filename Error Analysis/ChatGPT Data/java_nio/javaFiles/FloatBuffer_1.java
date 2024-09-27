import java.nio.FloatBuffer;

public class FloatBuffer_1 {
    public static void main(String[] args) {
        // Create a FloatBuffer with capacity of 5
        FloatBuffer buffer = FloatBuffer.allocate(5);
        
        // Define a float array to be put into the FloatBuffer
        float[] array = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        
        // Put the float array into the FloatBuffer
        buffer.put(array);
        
        // Print the FloatBuffer
        buffer.flip();
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
