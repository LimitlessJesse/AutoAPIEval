import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_2 {
    public static void main(String[] args) {
        MultiPixelPackedSampleModel sampleModel = new MultiPixelPackedSampleModel(0, 0, 0, 0);
        int band = 0;
        int sampleSize = sampleModel.getSampleSize(band);
        System.out.println("Sample size for band " + band + ": " + sampleSize);
    }
}
