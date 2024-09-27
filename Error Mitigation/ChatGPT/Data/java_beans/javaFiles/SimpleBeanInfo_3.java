import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.SimpleBeanInfo;

public class MyBeanInfo extends SimpleBeanInfo {
    
    @Override
    public BeanDescriptor getBeanDescriptor() {
        // Deny knowledge about the class and customizer of the bean
        // You can override this if you wish to provide explicit info
        return super.getBeanDescriptor();
    }

    public static void main(String[] args) {
        MyBeanInfo beanInfo = new MyBeanInfo();
        BeanDescriptor descriptor = beanInfo.getBeanDescriptor();
        System.out.println(descriptor);
    }
}
