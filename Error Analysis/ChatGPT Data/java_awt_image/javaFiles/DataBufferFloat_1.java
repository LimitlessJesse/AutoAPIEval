import java.awt.image.DataBufferFloat;

public class DataBufferFloat_1 {
    public static void main(String[] args) {
        float[] data = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        DataBufferFloat dataBuffer = new DataBufferFloat(data, data.length);
        float[] retrievedData = dataBuffer.getData();
        
        for (float value : retrievedData) {
            System.out.println(value);
        }
    }
}
