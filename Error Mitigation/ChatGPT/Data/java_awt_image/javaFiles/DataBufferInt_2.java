import java.awt.image.DataBufferInt;

public class DataBufferInt_2 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBufferInt buffer = new DataBufferInt(data, data.length);

        int bank = 0;
        int i = 2;
        int elem = buffer.getElem(bank, i);
        System.out.println("Element at bank " + bank + " and index " + i + ": " + elem);
    }
}
