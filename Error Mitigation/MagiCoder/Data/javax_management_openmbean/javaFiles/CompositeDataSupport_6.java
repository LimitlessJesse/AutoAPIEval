import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeDataSupport;

public class CompositeDataSupport_6 {
    public static void main(String[] args) {
        CompositeData cd1 = new CompositeDataSupport(
            "type1",
            new String[] {"name1", "name2"},
            new Object[] {"value1", "value2"}
        );

        CompositeData cd2 = new CompositeDataSupport(
            "type1",
            new String[] {"name1", "name2"},
            new Object[] {"value1", "value2"}
        );

        System.out.println(cd1.equals(cd2));  // Output: true
    }
}
