import java.awt.image.DataBufferDouble;

public class DataBufferDouble_3 {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        DataBufferDouble dataBuffer = new DataBufferDouble(data, data.length);
        double[] retrievedData = dataBuffer.getData();
        
        for (double d : retrievedData) {
            System.out.println(d);
        }
    }
}
