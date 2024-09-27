import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.SimpleType;

public class TabularDataSupport_4 {
    public static void main(String[] args) {
        TabularDataSupport tds = new TabularDataSupport();
        System.out.println(tds.isEmpty()); // true

        tds.setValue("column1", "row1", "value1");
        System.out.println(tds.isEmpty()); // false
    }
}
