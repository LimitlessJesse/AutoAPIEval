import java.awt.image.BufferedImage;
import java.awt.image.SampleModel;

public class SampleModel_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        SampleModel sm = image.getSampleModel();
        int sampleSize = sm.getSampleSize(0);
        System.out.println("Sample size of first band: " + sampleSize);
    }
}
