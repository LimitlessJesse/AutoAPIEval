import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

public class Raster_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        DataBuffer dataBuffer = raster.getDataBuffer();

        // Print the data buffer type
        System.out.println("Data Buffer Type: " + dataBuffer.getType());

        // Print the data buffer size
        System.out.println("Data Buffer Size: " + dataBuffer.getSize());

        // Print the data buffer as an array of ints
        int[] data = new int[dataBuffer.getSize()];
        dataBuffer.getDataElements(0, 0, 10, 10, data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
