import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;

public class SimpleBeanInfo_1 {
    public static void main(String[] args) {
        SimpleBeanInfo info = new SimpleBeanInfo();
        PropertyDescriptor[] propertyDescriptors = info.getPropertyDescriptors();
        for (PropertyDescriptor pd : propertyDescriptors) {
            System.out.println(pd.getName());
        }
    }
}

class SimpleBeanInfo extends java.beans.SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        // Deny knowledge of properties
        return null;
    }
}
