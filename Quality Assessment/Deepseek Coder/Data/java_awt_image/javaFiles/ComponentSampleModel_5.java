import java.awt.image.BufferedImage;
import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        ComponentSampleModel smodel = image.getSampleModel();
        int pixelStride = smodel.getPixelStride();
        System.out.println("Pixel Stride: " + pixelStride);
    }
}
