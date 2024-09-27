import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_5 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            @Override
            public BeanDescriptor getBeanDescriptor() {
                return super.getBeanDescriptor();
            }
        };

        BeanDescriptor descriptor = beanInfo.getBeanDescriptor();
        System.out.println(descriptor);
    }
}
