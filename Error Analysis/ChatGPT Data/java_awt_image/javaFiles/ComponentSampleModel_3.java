import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_3 {
    public static void main(String[] args) {
        ComponentSampleModel sampleModel = new ComponentSampleModel(0, 10, 5, 3, 15, new int[]{0, 1, 2});
        int numDataElements = sampleModel.getNumDataElements();
        System.out.println("Number of data elements: " + numDataElements);
    }
}
