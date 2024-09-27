import java.beans.FeatureDescriptor;

public class FeatureDescriptor_5 {
    public static void main(String[] args) {
        FeatureDescriptor fd = new FeatureDescriptor("name", "type");
        boolean hidden = fd.isHidden();
        System.out.println("Is feature hidden? " + hidden);
    }
}
