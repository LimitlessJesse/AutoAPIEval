import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.TabularType;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.InvalidKeyException;

public class TabularDataSupport_3 {
    public static void main(String[] args) {
        TabularDataSupport tabularData = new TabularDataSupport();
        try {
            tabularData.put(new Object[] {"key1"}, "value1");
            tabularData.put(new Object[] {"key2"}, "value2");
            System.out.println(tabularData.get(new Object[] {"key1"})); // prints: value1
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
