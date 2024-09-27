import java.awt.image.BufferedImage;
import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        MultiPixelPackedSampleModel model = (MultiPixelPackedSampleModel) image.getSampleModel();
        int transferType = model.getTransferType();
        System.out.println("Transfer Type: " + transferType);
    }
}
