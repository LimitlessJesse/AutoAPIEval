import java.awt.image.SampleModel;

public class SampleModel_4 {
    public static void main(String[] args) {
        SampleModel sampleModel = new SampleModel() {
            @Override
            public int[] getSampleSize() {
                // Implementation of getSampleSize method
                return new int[0];
            }
        };
        
        int[] sampleSize = sampleModel.getSampleSize();
        System.out.println("Sample size: " + sampleSize.length);
    }
}
