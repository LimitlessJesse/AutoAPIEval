import java.awt.image.DataBufferInt;

public class DataBufferInt_2 {
    public static void main(String[] args) {
        int[] dataArray = {1, 2, 3, 4, 5};
        DataBufferInt dataBuffer = new DataBufferInt(dataArray, 5);

        int element = dataBuffer.getElem(2);
        System.out.println("Element at index 2: " + element);
    }
}
