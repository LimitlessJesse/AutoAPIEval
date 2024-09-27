import java.awt.image.DataBufferShort;

public class DataBufferShort_4 {
    public static void main(String[] args) {
        DataBufferShort dataBufferShort = new DataBufferShort(10);
        int element = dataBufferShort.getElem(5);
        System.out.println("Element at index 5: " + element);
    }
}
