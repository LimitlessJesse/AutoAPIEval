import java.awt.image.BufferedImage;
import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_6 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        MultiPixelPackedSampleModel model = (MultiPixelPackedSampleModel) image.getSampleModel();
        int numDataElements = model.getNumDataElements();
        System.out.println("Number of data elements: " + numDataElements);
    }
}
