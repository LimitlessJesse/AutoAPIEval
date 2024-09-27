import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;

public class DataBuffer_5 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBufferByte(10, 1);
        System.out.println(dataBuffer.getDataType());

        dataBuffer = new DataBufferInt(10, 1);
        System.out.println(dataBuffer.getDataType());
    }
}
