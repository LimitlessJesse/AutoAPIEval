import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_4 {
    public static void main(String[] args) {
        MultiPixelPackedSampleModel sampleModel = new MultiPixelPackedSampleModel(0, 0, 0, 0, 0);
        int pixelBitStride = sampleModel.getPixelBitStride();
        System.out.println("Pixel Bit Stride: " + pixelBitStride);
    }
}
