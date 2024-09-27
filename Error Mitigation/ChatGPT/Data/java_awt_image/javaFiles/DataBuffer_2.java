import java.awt.image.DataBuffer;

public class DataBuffer_2 {
    public static void main(String[] args) {
        // Create a DataBuffer object
        DataBuffer dataBuffer = new DataBuffer();

        // Get the data array element from bank 0 at index 2
        int element = dataBuffer.getElem(0, 2);
        System.out.println("Element at bank 0, index 2: " + element);
    }
}
