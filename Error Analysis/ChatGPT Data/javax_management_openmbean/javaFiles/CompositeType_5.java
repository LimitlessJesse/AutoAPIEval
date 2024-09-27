import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;

public class CompositeType_5 {
    public static void main(String[] args) {
        try {
            // Create a CompositeType object
            CompositeType compositeType = new CompositeType("MyCompositeType", "Description", new String[]{"key"}, new String[]{"value"}, new OpenType[]{SimpleType.STRING});

            // Check if a value is valid for the CompositeType
            Object obj = "myValue";
            boolean isValid = compositeType.isValue(obj);
            System.out.println("Is value valid: " + isValid);
        } catch (OpenDataException e) {
            System.out.println("Error creating CompositeType: " + e.getMessage());
        }
    }
}
