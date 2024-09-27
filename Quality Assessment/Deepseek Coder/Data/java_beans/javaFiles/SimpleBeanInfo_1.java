import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_1 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            // Overriding the getBeanDescriptor method
            @Override
            public BeanDescriptor getBeanDescriptor() {
                return new BeanDescriptor(SimpleBeanInfo_1.class);
            }
        };

        BeanDescriptor descriptor = beanInfo.getBeanDescriptor();
        System.out.println(descriptor.getDisplayName());
    }
}
