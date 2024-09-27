import java.awt.image.DataBufferUShort;

public class DataBufferUShort_5 {
    public static void main(String[] args) {
        DataBufferUShort dataBuffer = new DataBufferUShort(10);
        int element = dataBuffer.getElem(5);
        System.out.println("Element at index 5: " + element);
    }
}
