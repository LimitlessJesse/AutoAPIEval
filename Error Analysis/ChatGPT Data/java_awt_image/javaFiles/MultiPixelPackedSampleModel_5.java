import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_5 {
    public static void main(String[] args) {
        // Create a MultiPixelPackedSampleModel object
        MultiPixelPackedSampleModel sampleModel = new MultiPixelPackedSampleModel(0, 100, 200, 1, 0);

        // Get the scanline stride using getScanlineStride() method
        int scanlineStride = sampleModel.getScanlineStride();
        
        System.out.println("Scanline Stride: " + scanlineStride);
    }
}
