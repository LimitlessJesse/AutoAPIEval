import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;

public class DataBuffer_9 {
    public static void main(String[] args) {
        DataBuffer dataBufferByte = new DataBufferByte(10, 1);
        DataBuffer dataBufferShort = new DataBufferShort(10, 1);
        DataBuffer dataBufferInt = new DataBufferInt(10, 1);

        System.out.println("DataBufferByte data type: " + dataBufferByte.getDataType());
        System.out.println("DataBufferShort data type: " + dataBufferShort.getDataType());
        System.out.println("DataBufferInt data type: " + dataBufferInt.getDataType());
    }
}
