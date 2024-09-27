import java.awt.image.SampleModel;

public class SampleModel_1 {
    public static void main(String[] args) {
        SampleModel sampleModel = new SampleModel(); // Instantiate SampleModel class
        int numBands = sampleModel.getNumBands(); // Call getNumBands method
        System.out.println("Number of bands: " + numBands);
    }
}
