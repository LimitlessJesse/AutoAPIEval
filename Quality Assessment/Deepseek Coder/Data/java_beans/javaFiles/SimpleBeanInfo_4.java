import java.beans.SimpleBeanInfo;
import java.beans.EventSetDescriptor;

public class SimpleBeanInfo_4 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            // Override the getEventSetDescriptors method
            @Override
            public EventSetDescriptor[] getEventSetDescriptors() {
                // Return an array of EventSetDescriptor objects
                return new EventSetDescriptor[] {
                    new EventSetDescriptor("event1", "property1")
                };
            }
        };

        // Get the EventSetDescriptors
        EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();

        // Print the EventSetDescriptors
        for (EventSetDescriptor eventSetDescriptor : eventSetDescriptors) {
            System.out.println("Event: " + eventSetDescriptor.getEvent());
            System.out.println("Property: " + eventSetDescriptor.getProperty());
        }
    }
}
