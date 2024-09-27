import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_3 {
    public static void main(String[] args) {
        MultiPixelPackedSampleModel sampleModel = new MultiPixelPackedSampleModel(0, 0, 0, 0, 0);
        int scanlineStride = sampleModel.getScanlineStride();
        System.out.println("Scanline Stride: " + scanlineStride);
    }
}
