import java.beans.FeatureDescriptor;

public class FeatureDescriptor_1 {
    public static void main(String[] args) {
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();
        String displayName = featureDescriptor.getDisplayName();
        System.out.println("Display Name: " + displayName);
    }
}
