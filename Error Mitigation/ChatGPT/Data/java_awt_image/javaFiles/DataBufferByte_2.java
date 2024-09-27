import java.awt.image.DataBufferByte;

public class DataBufferByte_2 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);

        int bank = 0;
        int i = 2;
        int elem = dataBuffer.getElem(bank, i);

        System.out.println("Requested data array element: " + elem);
    }
}
