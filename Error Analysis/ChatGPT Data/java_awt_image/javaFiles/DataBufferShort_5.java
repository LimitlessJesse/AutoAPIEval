import java.awt.image.DataBufferShort;

public class DataBufferShort_5 {
    public static void main(String[] args) {
        // Create a DataBufferShort object
        short[] data = {1, 2, 3, 4, 5};
        DataBufferShort bufferShort = new DataBufferShort(data, data.length);

        // Use getData() to retrieve the data as a short array
        short[] retrievedData = bufferShort.getData();
        
        // Display the retrieved data
        for (short value : retrievedData) {
            System.out.print(value + " ");
        }
    }
}
