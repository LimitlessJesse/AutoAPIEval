import java.awt.image.DataBuffer;
import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_5 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel sampleModel = new SinglePixelPackedSampleModel(DataBuffer.TYPE_INT, width, height, bitMasks);
        int x = 0;
        int y = 0;
        int[] iArray = {255, 0, 0}; // Example input samples
        DataBuffer data = sampleModel.getDataBuffer();
        
        sampleModel.setPixel(x, y, iArray, data);
    }
}
