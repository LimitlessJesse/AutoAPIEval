import java.awt.image.DataBuffer;
import java.awt.image.BufferedImage;

public class DataBuffer_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        DataBuffer buffer = image.getRaster().getDataBuffer();
        int elem = buffer.getElem(0, 0);
        System.out.println(elem);
    }
}
