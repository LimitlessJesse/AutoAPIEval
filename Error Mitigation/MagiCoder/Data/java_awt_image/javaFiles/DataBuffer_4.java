import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBuffer_4 {
    public static void main(String[] args) {
        int[] data = new int[10];
        DataBuffer buffer = new DataBufferInt(data, data.length);
        System.out.println(buffer.getSize());
    }
}
