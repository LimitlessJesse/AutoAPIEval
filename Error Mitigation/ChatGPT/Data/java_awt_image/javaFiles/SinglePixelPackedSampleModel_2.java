import java.awt.image.DataBuffer;
import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_2 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel sampleModel = new SinglePixelPackedSampleModel(DataBuffer.TYPE_INT, width, height, bitMasks);
        DataBuffer data = sampleModel.getDataBuffer();
        int x = 0;
        int y = 0;
        int b = 0;
        int sample = sampleModel.getSample(x, y, b, data);
        System.out.println("Sample value: " + sample);
    }
}
