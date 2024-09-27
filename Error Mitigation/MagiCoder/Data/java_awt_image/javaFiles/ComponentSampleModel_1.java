import java.awt.image.BufferedImage;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.SampleModel;

public class ComponentSampleModel_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        SampleModel sampleModel = image.getSampleModel();
        if (sampleModel instanceof ComponentSampleModel) {
            ComponentSampleModel componentSampleModel = (ComponentSampleModel) sampleModel;
            int sampleSize = componentSampleModel.getSampleSize(0);
            System.out.println("Sample size: " + sampleSize);
        }
    }
}
