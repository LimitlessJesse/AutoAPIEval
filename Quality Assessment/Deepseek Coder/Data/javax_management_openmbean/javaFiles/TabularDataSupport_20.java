import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.CompositeData;
import javax.management.openmbean.SimpleType;

public class TabularDataSupport_20 {
    public static void main(String[] args) {
        TabularDataSupport tabularDataSupport = new TabularDataSupport();

        // Adding data to the tabular data
        CompositeData compositeData = tabularDataSupport.newCompositeData(
                new String[] {"Name", "Age"},
                new Object[] {"John", 25},
                new Class[][] {{String.class, SimpleType.STRING}, {Integer.class, SimpleType.INTEGER}}
        );
        tabularDataSupport.add(compositeData);

        // Using toString() method to get the string representation of the tabular data
        System.out.println(tabularDataSupport.toString());
    }
}
