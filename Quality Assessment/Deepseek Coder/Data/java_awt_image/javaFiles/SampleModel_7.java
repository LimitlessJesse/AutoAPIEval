import java.awt.image.BufferedImage;
import java.awt.image.SampleModel;

public class SampleModel_7 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        SampleModel sm = image.getSampleModel();
        int height = sm.getHeight();
        System.out.println("Height of the image: " + height);
    }
}
