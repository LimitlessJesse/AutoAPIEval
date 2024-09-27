import java.awt.image.DataBufferUShort;
import java.awt.image.BufferedImage;

public class DataBufferUShort_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_USHORT_GRAY);
        DataBufferUShort buffer = (DataBufferUShort) image.getRaster().getDataBuffer();
        buffer.setElem(0, 0, 65535);
        System.out.println(buffer.getElem(0, 0));
    }
}
