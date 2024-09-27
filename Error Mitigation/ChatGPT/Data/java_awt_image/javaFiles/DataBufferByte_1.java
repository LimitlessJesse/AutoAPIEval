import java.awt.image.DataBufferByte;

public class DataBufferByte_1 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        DataBufferByte dataBuffer = new DataBufferByte(data, data.length);
        
        byte[] retrievedData = dataBuffer.getData();
        
        for(byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}
