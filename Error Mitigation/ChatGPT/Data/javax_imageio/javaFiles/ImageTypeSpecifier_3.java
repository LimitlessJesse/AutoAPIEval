import javax.imageio.ImageTypeSpecifier;
import java.awt.image.SampleModel;

public class ImageTypeSpecifier_3 {
    public static void main(String[] args) {
        ImageTypeSpecifier imageTypeSpecifier = new ImageTypeSpecifier();
        SampleModel sampleModel = imageTypeSpecifier.getSampleModel();
        System.out.println("SampleModel dimensions: " + sampleModel.getWidth() + "x" + sampleModel.getHeight());
    }
}
