import java.awt.image.SampleModel;

public class SampleModel_4 {
    public static void main(String[] args) {
        // Creating a SampleModel
        SampleModel sampleModel = SampleModel.createCompatibleSampleModel(w, h);
        
        // Example usage
        System.out.println("Sample model created: " + sampleModel.toString());
    }
}
