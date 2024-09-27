import java.awt.image.DataBuffer;
import java.awt.image.BufferedImage;

public class DataBuffer_3 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        DataBuffer buffer = image.getRaster().getDataBuffer();
        buffer.setElem(0, 0, 255); // Set the value of the first pixel to 255
        System.out.println(buffer.getElem(0, 0)); // Print the value of the first pixel
    }
}
