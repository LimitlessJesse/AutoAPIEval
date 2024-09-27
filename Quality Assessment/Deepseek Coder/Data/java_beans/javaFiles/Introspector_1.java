import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class Introspector_1 {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(ArrayList.class);
            System.out.println("Bean name: " + beanInfo.getBeanDescriptor().getName());
            System.out.println("Methods: ");
            for (java.beans.MethodDescriptor md : beanInfo.getMethodDescriptors()) {
                System.out.println(md.getMethod().getName());
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
