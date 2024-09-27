import java.awt.image.DataBufferShort;
import java.awt.image.BufferedImage;

public class DataBufferShort_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_GRAY);
        DataBufferShort buffer = (DataBufferShort) image.getRaster().getDataBuffer();
        buffer.setElem(0, 0, (short) 123);
        System.out.println(buffer.getElem(0, 0));
    }
}
