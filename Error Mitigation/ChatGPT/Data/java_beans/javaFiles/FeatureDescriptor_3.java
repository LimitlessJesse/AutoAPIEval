import java.beans.FeatureDescriptor;

public class FeatureDescriptor_3 {
    public static void main(String[] args) {
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();
        String name = featureDescriptor.getName();
        System.out.println("Programmatic name: " + name);
    }
}
