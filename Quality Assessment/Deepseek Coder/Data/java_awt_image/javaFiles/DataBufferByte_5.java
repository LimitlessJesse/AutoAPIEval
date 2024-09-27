import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class DataBufferByte_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_GRAY);
        DataBufferByte buffer = (DataBufferByte) image.getRaster().getDataBuffer();
        byte[] data = buffer.getData(0);

        // Print the first 10 bytes of the data array
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
