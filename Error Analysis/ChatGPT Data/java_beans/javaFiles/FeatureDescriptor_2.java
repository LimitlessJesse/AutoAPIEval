import java.beans.FeatureDescriptor;

public class FeatureDescriptor_2 {
    public static void main(String[] args) {
        FeatureDescriptor descriptor = new FeatureDescriptor();
        descriptor.setName("MyFeature");
        System.out.println(descriptor.getName());
    }
}
