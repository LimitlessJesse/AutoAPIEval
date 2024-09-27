import java.awt.image.MultiPixelPackedSampleModel;

public class MultiPixelPackedSampleModel_5 {
    public static void main(String[] args) {
        MultiPixelPackedSampleModel sampleModel = new MultiPixelPackedSampleModel(0, 0, 0, 0);
        int x = 5;
        int y = 10;
        int offset = sampleModel.getOffset(x, y);
        System.out.println("Offset of pixel (" + x + ", " + y + "): " + offset);
    }
}
