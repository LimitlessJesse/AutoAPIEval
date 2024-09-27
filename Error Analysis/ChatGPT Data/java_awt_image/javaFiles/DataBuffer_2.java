import java.awt.image.DataBuffer;

public class DataBuffer_2 {
    public static void main(String[] args) {
        // Initialize a DataBuffer
        int[] dataArray = {1, 2, 3, 4, 5};
        DataBuffer dataBuffer = new DataBufferInt(dataArray, dataArray.length);

        // Get element at index
        int index = 2;
        int element = dataBuffer.getElem(index);
        System.out.println("Element at index " + index + ": " + element);
    }
}
