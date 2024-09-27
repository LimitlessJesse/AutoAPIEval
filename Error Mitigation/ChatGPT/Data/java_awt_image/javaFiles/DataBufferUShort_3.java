import java.awt.image.DataBufferUShort;

public class DataBufferUShort_3 {
    public static void main(String[] args) {
        DataBufferUShort dataBuffer = new DataBufferUShort(10);
        int bank = 0;
        int i = 5;
        int val = 100;
        
        dataBuffer.setElem(bank, i, val);
    }
}
