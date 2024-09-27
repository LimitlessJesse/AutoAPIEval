import java.beans.beancontext.BeanContextChildSupport;
import java.beans.beancontext.BeanContext;

public class BeanContextChildSupport_2 {
    public static void main(String[] args) {
        BeanContextChildSupport support = new BeanContextChildSupport();
        BeanContext context = support.getBeanContext();
        System.out.println("Nesting BeanContext: " + context);
    }
}
