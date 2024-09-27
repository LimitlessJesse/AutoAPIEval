import java.awt.image.DataBufferUShort;
import java.awt.image.BufferedImage;

public class DataBufferUShort_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_USHORT_GRAY);
        DataBufferUShort buffer = (DataBufferUShort) image.getRaster().getDataBuffer();
        int value = buffer.getElem(0, 0);
        System.out.println(value);
    }
}
