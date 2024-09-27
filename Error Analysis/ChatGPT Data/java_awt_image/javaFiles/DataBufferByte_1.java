import java.awt.image.DataBufferByte;

public class DataBufferByte_1 {
    public static void main(String[] args) {
        // Create an example DataBufferByte object
        byte[] data = {1, 2, 3, 4, 5};
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);

        // Access the data using getData() method
        byte[] retrievedData = dataBuffer.getData();
        for (byte value : retrievedData) {
            System.out.print(value + " ");
        }
    }
}
