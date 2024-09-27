import java.awt.image.DataBuffer;

public class DataBuffer_1 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer();
        int size = dataBuffer.getSize();
        System.out.println("Size of all banks: " + size);
    }
}
