import java.beans.FeatureDescriptor;
import java.util.ArrayList;

public class FeatureDescriptor_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        FeatureDescriptor featureDescriptor = new FeatureDescriptor(list, "add", "boolean");
        System.out.println("Feature name: " + featureDescriptor.getName());
    }
}
