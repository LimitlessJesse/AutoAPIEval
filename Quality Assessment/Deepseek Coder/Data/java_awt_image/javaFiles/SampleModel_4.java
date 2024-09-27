import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;

public class SampleModel_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        SampleModel sampleModel = image.getSampleModel();
        int transferType = sampleModel.getTransferType();
        System.out.println("Transfer Type: " + transferType);
    }
}
