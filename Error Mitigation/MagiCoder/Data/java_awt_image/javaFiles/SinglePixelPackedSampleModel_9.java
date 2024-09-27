import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_9 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel model = new SinglePixelPackedSampleModel(1, 1, 1, 1);
        int stride = model.getScanlineStride();
        System.out.println("Scanline stride: " + stride);
    }
}
