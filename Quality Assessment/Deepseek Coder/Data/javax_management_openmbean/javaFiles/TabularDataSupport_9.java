import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.SimpleType;

public class TabularDataSupport_9 {
    public static void main(String[] args) {
        TabularDataSupport tds = new TabularDataSupport();
        tds.addRow(new Object[] { "John", 25, "Male" });
        tds.addRow(new Object[] { "Jane", 30, "Female" });

        System.out.println(tds.getRowCount());  // Output: 2

        tds.clear();

        System.out.println(tds.getRowCount());  // Output: 0
    }
}
