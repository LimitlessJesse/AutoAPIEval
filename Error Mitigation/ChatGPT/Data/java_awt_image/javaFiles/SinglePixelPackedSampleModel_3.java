import java.awt.image.DataBuffer;
import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_3 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel sampleModel = new SinglePixelPackedSampleModel(DataBuffer.TYPE_INT, 10, 10, new int[]{0xFF0000, 0x00FF00, 0x0000FF});
        int x = 0;
        int y = 0;
        int w = 10;
        int h = 10;
        int b = 0;
        int[] iArray = new int[100];
        DataBuffer data = new DataBuffer();
        
        int[] samples = sampleModel.getSamples(x, y, w, h, b, iArray, data);
        for (int sample : samples) {
            System.out.println(sample);
        }
    }
}
