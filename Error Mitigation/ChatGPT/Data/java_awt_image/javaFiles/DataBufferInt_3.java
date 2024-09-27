import java.awt.image.DataBufferInt;

public class DataBufferInt_3 {
    public static void main(String[] args) {
        DataBufferInt dataBufferInt = new DataBufferInt(10);
        dataBufferInt.setElem(0, 5, 100);
    }
}
