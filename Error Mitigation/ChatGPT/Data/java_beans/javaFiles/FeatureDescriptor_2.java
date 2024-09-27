import java.beans.FeatureDescriptor;

public class FeatureDescriptor_2 {
    public static void main(String[] args) {
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();
        featureDescriptor.setDisplayName("My Display Name");
        System.out.println("Display Name: " + featureDescriptor.getDisplayName());
    }
}
