import java.awt.image.DataBufferShort;
import java.awt.image.BufferedImage;

public class DataBufferShort_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_GRAY);
        DataBufferShort buffer = (DataBufferShort) image.getRaster().getDataBuffer();
        buffer.setElem(0, 0, (short) 123);
        short value = buffer.getElem(0, 0);
        System.out.println(value);
    }
}
