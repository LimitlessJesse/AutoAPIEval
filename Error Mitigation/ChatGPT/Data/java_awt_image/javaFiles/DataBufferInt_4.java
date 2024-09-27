import java.awt.image.DataBufferInt;

public class DataBufferInt_4 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        DataBufferInt dataBuffer = new DataBufferInt(data, data.length);

        int element = dataBuffer.getElem(2);
        System.out.println("Element at index 2: " + element);
    }
}
