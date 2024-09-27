import java.awt.image.DataBufferFloat;

public class DataBufferFloat_4 {
    public static void main(String[] args) {
        // Create a float array with values
        float[] data = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        
        // Create a DataBufferFloat object with the float array
        DataBufferFloat dataBufferFloat = new DataBufferFloat(data, data.length);
        
        // Get the element at index 2
        float element = dataBufferFloat.getElemFloat(2);
        
        System.out.println("Element at index 2: " + element);
    }
}
