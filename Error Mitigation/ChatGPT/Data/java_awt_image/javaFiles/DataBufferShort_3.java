import java.awt.image.DataBufferShort;

public class DataBufferShort_3 {
    public static void main(String[] args) {
        short[] data = {1, 2, 3, 4, 5};
        DataBufferShort dataBuffer = new DataBufferShort(data, data.length);
        
        short[] retrievedData = dataBuffer.getData();
        
        for (short value : retrievedData) {
            System.out.print(value + " ");
        }
    }
}
