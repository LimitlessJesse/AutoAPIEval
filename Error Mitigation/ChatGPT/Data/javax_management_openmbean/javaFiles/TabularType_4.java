import javax.management.openmbean.TabularType;
import javax.management.openmbean.TabularData;

public class TabularType_4 {
    public static void main(String[] args) {
        TabularType tabularType = new TabularType("TestTabularType", "Description", new String[]{"key"});
        TabularData tabularData = null; // Initialize your TabularData object here

        boolean isValue = tabularType.isValue(tabularData);
        System.out.println("Is value: " + isValue);
    }
}
