import java.awt.image.DataBufferDouble;

public class DataBufferDouble_4 {
    public static void main(String[] args) {
        DataBufferDouble dataBuffer = new DataBufferDouble(10);
        double[] data = dataBuffer.getData();
        
        // Accessing the first element of the data array as an int
        int element = dataBuffer.getElem(0);
        System.out.println("Element at index 0: " + element);
    }
}
