import javax.management.openmbean.CompositeData;
import javax.management.openmbean.TabularDataSupport;

public class TabularDataSupport_3 {
    public static void main(String[] args) {
        TabularDataSupport tabularData = new TabularDataSupport();
        
        // Creating a sample CompositeData object
        CompositeData compositeData = null; // Initialize with actual CompositeData
        
        // Adding the CompositeData object to the TabularDataSupport instance
        tabularData.put(compositeData);
    }
}
