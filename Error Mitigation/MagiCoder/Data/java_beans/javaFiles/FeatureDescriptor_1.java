import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

public class FeatureDescriptor_1 {
    public static void main(String[] args) throws IntrospectionException {
        // Create a PropertyDescriptor
        PropertyDescriptor pd = new PropertyDescriptor("name", FeatureDescriptor_1.class);

        // Get the FeatureDescriptor
        FeatureDescriptor fd = pd;

        // Get the name
        String name = fd.getName();

        System.out.println("The programmatic name of the property is: " + name);
    }
}
