import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.CompositeData;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.OpenDataException;

public class TabularDataSupport_2 {
    public static void main(String[] args) throws OpenDataException {
        TabularDataSupport tabularData = new TabularDataSupport();

        // Adding a row
        CompositeData row1 = tabularData.newCompositeDataBuilder()
               .add("column1", SimpleType.STRING, "value1")
               .add("column2", SimpleType.INTEGER, 2)
               .getCompositeData();
        tabularData.put(row1);

        // Adding another row
        CompositeData row2 = tabularData.newCompositeDataBuilder()
               .add("column1", SimpleType.STRING, "value2")
               .add("column2", SimpleType.INTEGER, 3)
               .getCompositeData();
        tabularData.put(row2);

        // Getting the size of the tabular data
        int size = tabularData.size();
        System.out.println("Size of the tabular data: " + size);
    }
}
