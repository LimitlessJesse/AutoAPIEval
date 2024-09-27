import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_3 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel model = new SinglePixelPackedSampleModel(8, 16, 2, 0, 1);
        int sampleSize = model.getSampleSize(0);
        System.out.println("Sample size: " + sampleSize);
    }
}
