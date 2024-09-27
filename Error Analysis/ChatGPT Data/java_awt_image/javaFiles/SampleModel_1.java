import java.awt.image.DataBuffer;
import java.awt.image.PixelInterleavedSampleModel;

public class SampleModel_1 {
    public static void main(String[] args) {
        // Create a sample model
        DataBuffer dataBuffer = new DataBufferByte(new byte[10], 10);
        SampleModel sampleModel = new PixelInterleavedSampleModel(DataBuffer.TYPE_BYTE, 2, 5, 1, 2, new int[]{0, 1});

        // Get the data type
        int dataType = sampleModel.getDataType();
        System.out.println("Data type: " + dataType);
    }
}
