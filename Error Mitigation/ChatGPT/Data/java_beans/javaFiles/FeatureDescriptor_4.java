import java.beans.FeatureDescriptor;

public class FeatureDescriptor_4 {
    public static void main(String[] args) {
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();
        featureDescriptor.setName("exampleName");
        System.out.println("Programmatic name set: " + featureDescriptor.getName());
    }
}
