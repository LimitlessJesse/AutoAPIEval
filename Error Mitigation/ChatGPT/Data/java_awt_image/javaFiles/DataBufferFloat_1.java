import java.awt.image.DataBufferFloat;

public class DataBufferFloat_1 {
    public static void main(String[] args) {
        float[] data = new float[5];
        DataBufferFloat dataBuffer = new DataBufferFloat(data, data.length);

        float[] retrievedData = dataBuffer.getData();
        for (float value : retrievedData) {
            System.out.println(value);
        }
    }
}
