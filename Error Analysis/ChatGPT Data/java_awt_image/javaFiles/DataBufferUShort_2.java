import java.awt.image.DataBufferUShort;

public class DataBufferUShort_2 {
    public static void main(String[] args) {
        // Create a DataBufferUShort object
        DataBufferUShort buffer = new DataBufferUShort(10);

        // Get the element at index 5 from bank 0
        int element = buffer.getElem(0, 5);
        System.out.println("Element at index 5 in bank 0: " + element);
    }
}
