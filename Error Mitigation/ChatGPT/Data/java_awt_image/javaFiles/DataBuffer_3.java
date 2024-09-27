import java.awt.image.DataBuffer;

public class DataBuffer_3 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer();
        int bank = 0;
        int i = 1;
        int val = 10;
        
        dataBuffer.setElem(bank, i, val);
    }
}
