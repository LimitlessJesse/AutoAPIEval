import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;

public class DataBuffer_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        DataBuffer buffer = image.getRaster().getDataBuffer();
        int size = buffer.getSize();
        System.out.println("Size of the DataBuffer: " + size);
    }
}
