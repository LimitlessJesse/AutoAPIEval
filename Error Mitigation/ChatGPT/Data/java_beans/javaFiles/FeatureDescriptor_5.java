import java.beans.FeatureDescriptor;

public class FeatureDescriptor_5 {
    public static void main(String[] args) {
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();
        featureDescriptor.setDisplayName("Display Name");
        featureDescriptor.setShortDescription("Short Description");
        
        String shortDescription = featureDescriptor.getShortDescription();
        System.out.println("Short Description: " + shortDescription);
    }
}
