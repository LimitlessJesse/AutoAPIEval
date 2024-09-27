import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;

public class CompositeDataSupport_2 {
    public static void main(String[] args) {
        // Define a composite type
        CompositeType compositeType = new CompositeType("TestType", "A test composite type", new String[] {"name", "age"}, new String[] {"A name", "An age"}, new CompositeType[] {});

        // Create a composite data
        CompositeData compositeData;
        try {
            compositeData = compositeType.createCompositeData(new Object[] {"John", 30});
        } catch (OpenDataException e) {
            throw new RuntimeException(e);
        }

        // Create a CompositeDataSupport object
        CompositeDataSupport compositeDataSupport = new CompositeDataSupport(compositeType, compositeData);

        // Get the value of the "name" attribute
        String name = (String) compositeDataSupport.get("name");
        System.out.println("Name: " + name);

        // Get the value of the "age" attribute
        int age = (int) compositeDataSupport.get("age");
        System.out.println("Age: " + age);
    }
}
