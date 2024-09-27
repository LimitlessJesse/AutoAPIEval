import java.awt.image.DataBuffer;

public class DataBuffer_4 {
    public static void main(String[] args) {
        // Instantiate DataBuffer instance
        DataBuffer buffer = new DataBuffer();

        // Set element at index 0 with value 10
        buffer.setElem(0, 10);

        // Print the value at index 0
        System.out.println(buffer.getElem(0));
    }
}
