import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.SampleModel;

public class SampleModel_12 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        SampleModel sampleModel = raster.getSampleModel();
        int sampleSize = sampleModel.getSampleSize(0);
        System.out.println("Sample size: " + sampleSize);
    }
}
