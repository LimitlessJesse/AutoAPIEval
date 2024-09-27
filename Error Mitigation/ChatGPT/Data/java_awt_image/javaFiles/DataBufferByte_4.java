import java.awt.image.DataBufferByte;

public class DataBufferByte_4 {
    public static void main(String[] args) {
        byte[] data = {10, 20, 30, 40, 50};
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);

        int element = dataBuffer.getElem(2);
        System.out.println("Element at index 2: " + element);
    }
}
