import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_3 {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = new SimpleBeanInfo();
            EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();

            for (EventSetDescriptor eventSetDescriptor : eventSetDescriptors) {
                System.out.println("Event Set Descriptor: " + eventSetDescriptor);
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
