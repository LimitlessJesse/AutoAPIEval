import java.awt.image.BufferedImage;
import java.awt.image.SampleModel;

public class SampleModel_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        SampleModel sampleModel = image.getSampleModel();
        int numBands = sampleModel.getNumBands();
        System.out.println("Number of bands: " + numBands);
    }
}
