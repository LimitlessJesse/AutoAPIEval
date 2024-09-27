import java.awt.image.DataBufferInt;

public class DataBufferInt_1 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBufferInt dataBuffer = new DataBufferInt(data, data.length);
        
        int[] retrievedData = dataBuffer.getData();
        
        for (int i : retrievedData) {
            System.out.print(i + " ");
        }
    }
}
