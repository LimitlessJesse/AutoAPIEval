import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;

public class SampleModel_2 {
    public static void main(String[] args) {
        int[] bandOffsets = {0, 1, 2};
        SampleModel sampleModel = new ComponentSampleModel(DataBuffer.TYPE_BYTE, 3, 1, 3, 3, bandOffsets);
        int[] sampleSize = sampleModel.getSampleSize();
        for (int size : sampleSize) {
            System.out.println("Sample size: " + size);
        }
    }
}
