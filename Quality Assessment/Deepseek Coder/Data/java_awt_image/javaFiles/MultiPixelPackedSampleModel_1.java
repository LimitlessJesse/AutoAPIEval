import java.awt.image.BufferedImage;
import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        MultiPixelPackedSampleModel model = (MultiPixelPackedSampleModel) image.getSampleModel();
        int sampleSize = model.getSampleSize(0);
        System.out.println("Sample size: " + sampleSize);
    }
}
