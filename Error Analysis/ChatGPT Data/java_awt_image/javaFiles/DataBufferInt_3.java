import java.awt.image.DataBufferInt;

public class DataBufferInt_3 {
    public static void main(String[] args) {
        DataBufferInt dataBuffer = new DataBufferInt(10);
        dataBuffer.setElem(5, 100); // sets element at index 5 to value 100
    }
}
