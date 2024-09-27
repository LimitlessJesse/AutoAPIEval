import java.awt.image.DataBufferShort;

public class DataBufferShort_2 {
    public static void main(String[] args) {
        // Create a DataBufferShort object
        DataBufferShort dataBufferShort = new DataBufferShort(10);
        
        // Get the short array from the specified bank
        short[] data = dataBufferShort.getData(0);
        
        // Print the data
        for (short value : data) {
            System.out.println(value);
        }
    }
}
