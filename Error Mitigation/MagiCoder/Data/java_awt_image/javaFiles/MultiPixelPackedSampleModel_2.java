import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.Raster;

public class MultiPixelPackedSampleModel_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        MultiPixelPackedSampleModel model = (MultiPixelPackedSampleModel) raster.getDataBuffer().getDataModel();
        int scanlineStride = model.getScanlineStride();
        System.out.println("Scanline stride: " + scanlineStride);
    }
}
