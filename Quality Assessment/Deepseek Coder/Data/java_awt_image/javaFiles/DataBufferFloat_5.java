import java.awt.image.BufferedImage;
import java.awt.image.DataBufferFloat;
import java.awt.image.DataBuffer;

public class DataBufferFloat_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_3BYTE_BGR);
        DataBuffer buffer = image.getRaster().getDataBuffer();
        if (buffer instanceof DataBufferFloat) {
            DataBufferFloat dataBufferFloat = (DataBufferFloat) buffer;
            float[] data = dataBufferFloat.getData();
            for (float f : data) {
                System.out.println(f);
            }
        }
    }
}
