import java.awt.image.DataBufferByte;

public class DataBufferByte_5 {
    public static void main(String[] args) {
        byte[] data = {10, 20, 30, 40, 50};
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);

        // Set the element at index 2 to 35
        dataBuffer.setElem(2, 35);

        // Print the updated data array
        for (int i = 0; i < data.length; i++) {
            System.out.println("Element at index " + i + ": " + data[i]);
        }
    }
}
