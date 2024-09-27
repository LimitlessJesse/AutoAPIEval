import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_5 {
    public static void main(String[] args) {
        SimpleBeanInfo info = new SimpleBeanInfo() {
            @Override
            public BeanDescriptor getBeanDescriptor() {
                BeanDescriptor bd = new BeanDescriptor(Main.class);
                bd.setDisplayName("Custom Bean Descriptor");
                return bd;
            }
        };
        
        BeanDescriptor beanDescriptor = info.getBeanDescriptor();
        System.out.println("Bean Display Name: " + beanDescriptor.getDisplayName());
    }
}
