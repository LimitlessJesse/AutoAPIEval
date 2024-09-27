import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBuffer_4 {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBufferInt(10, 2);
        System.out.println(buffer.getNumBanks());
    }
}
