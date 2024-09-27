import java.awt.image.SampleModel;

public class SampleModel_3 {
    public static void main(String[] args) {
        SampleModel sampleModel = new SampleModel() {
            @Override
            public int getNumBands() {
                // Get the number of bands
                return 3;
            }

            // Other abstract methods of SampleModel can be implemented here
        };

        int numBands = sampleModel.getNumBands();
        System.out.println("Number of bands: " + numBands);
    }
}
