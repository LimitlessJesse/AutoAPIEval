import java.beans.FeatureDescriptor;

public class FeatureDescriptor_4 {
    public static void main(String[] args) {
        FeatureDescriptor fd = new FeatureDescriptor();
        fd.setDisplayName("MyDisplayName");
        System.out.println("Display Name: " + fd.getDisplayName());
    }
}
