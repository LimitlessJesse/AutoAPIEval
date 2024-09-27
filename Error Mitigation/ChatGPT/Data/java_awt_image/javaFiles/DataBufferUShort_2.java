import java.awt.image.DataBufferUShort;

public class DataBufferUShort_2 {
    public static void main(String[] args) {
        DataBufferUShort dataBuffer = new DataBufferUShort(10);
        int bank = 0;
        int i = 5;
        int elem = dataBuffer.getElem(bank, i);
        System.out.println("Element at bank " + bank + " and index " + i + ": " + elem);
    }
}
