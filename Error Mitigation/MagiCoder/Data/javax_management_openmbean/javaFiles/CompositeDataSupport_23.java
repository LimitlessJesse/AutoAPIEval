import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.InvalidKeyException;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;

public class CompositeDataSupport_23 {
    public static void main(String[] args) throws InvalidKeyException, OpenDataException {
        // Define a composite type
        CompositeType compositeType = new CompositeType(
                "MyCompositeType",
                "My composite type",
                new String[] {"myString", "myInteger"},
                new String[] {"A string", "An integer"},
                new OpenType[] {SimpleType.STRING, SimpleType.INTEGER},
                false);

        // Create a composite data
        CompositeDataSupport compositeData = new CompositeDataSupport(compositeType);
        compositeData.set("myString", "Hello");
        compositeData.set("myInteger", 123);

        // Print the composite data
        System.out.println(compositeData.toString());
    }
}
