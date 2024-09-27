import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class Introspector_1 {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Introspector_1.class);
            System.out.println(beanInfo);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
