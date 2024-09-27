import java.awt.image.BufferedImage;
import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ComponentSampleModel sampleModel = image.getSampleModel();
        int sampleSize = sampleModel.getSampleSize(0);
        System.out.println("Sample size: " + sampleSize);
    }
}
