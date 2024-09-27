import java.awt.image.DataBufferUShort;

public class DataBufferUShort_1 {
    public static void main(String[] args) {
        DataBufferUShort dataBuffer = new DataBufferUShort(10);
        short[] data = dataBuffer.getData();
        for (short value : data) {
            System.out.print(value + " ");
        }
    }
}
