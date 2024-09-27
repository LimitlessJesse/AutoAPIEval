import java.awt.image.DataBufferByte;

public class DataBufferByte_3 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);

        // Set the element at index 2 in bank 0 to the value 5
        dataBuffer.setElem(0, 2, 5);
    }
}
