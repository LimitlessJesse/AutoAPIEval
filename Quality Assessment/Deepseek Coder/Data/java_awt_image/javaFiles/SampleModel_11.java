import java.awt.image.BufferedImage;
import java.awt.image.SampleModel;

public class SampleModel_11 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        SampleModel sm = image.getSampleModel();
        int width = sm.getWidth();
        System.out.println("Width of the image: " + width);
    }
}
