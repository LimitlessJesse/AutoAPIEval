import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBufferInt_1 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBufferInt buffer = new DataBufferInt(data, data.length);
        int bank = 0;
        int i = 2;
        int elem = buffer.getElem(bank, i);
        System.out.println("The requested data array element is: " + elem);
    }
}
