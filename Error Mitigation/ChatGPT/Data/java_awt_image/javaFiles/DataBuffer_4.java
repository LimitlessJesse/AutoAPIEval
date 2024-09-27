import java.awt.image.DataBuffer;

public class DataBuffer_4 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer();
        int offset = dataBuffer.getOffset();
        System.out.println("Offset of the default bank: " + offset);
    }
}
