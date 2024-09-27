import java.awt.image.BufferedImage;
import java.awt.image.DataBufferDouble;

public class DataBufferDouble_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_GRAY);
        DataBufferDouble buffer = (DataBufferDouble) image.getRaster().getDataBuffer();
        double[] data = buffer.getData();

        // Print the data
        for (double d : data) {
            System.out.println(d);
        }
    }
}
