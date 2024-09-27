import java.awt.image.BufferedImage;
import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_BYTE_GRAY);
        SinglePixelPackedSampleModel model = (SinglePixelPackedSampleModel) image.getSampleModel();
        int stride = model.getScanlineStride();
        System.out.println("Number of bytes between start of two consecutive scanlines: " + stride);
    }
}
