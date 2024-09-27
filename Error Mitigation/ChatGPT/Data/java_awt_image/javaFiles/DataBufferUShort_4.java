import java.awt.image.DataBufferUShort;

public class DataBufferUShort_4 {
    public static void main(String[] args) {
        DataBufferUShort dataBufferUShort = new DataBufferUShort(10);
        int element = dataBufferUShort.getElem(5);
        System.out.println("Element at index 5: " + element);
    }
}
