import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBufferInt_5 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBufferInt buffer = new DataBufferInt(data, data.length);
        int element = buffer.getElem(2);
        System.out.println("The requested data array element is: " + element);
    }
}
