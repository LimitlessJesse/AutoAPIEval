import java.beans.EventSetDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_2 {
    public static void main(String[] args) {
        // Create an instance of SimpleBeanInfo
        SimpleBeanInfo beanInfo = new SimpleBeanInfo();
        
        // Get the EventSetDescriptors from the SimpleBeanInfo object
        EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();
        
        // Print out the EventSetDescriptors
        for(EventSetDescriptor descriptor : eventSetDescriptors) {
            System.out.println(descriptor);
        }
    }
}
