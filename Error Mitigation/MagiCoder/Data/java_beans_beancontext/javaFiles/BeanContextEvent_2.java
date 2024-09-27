import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextEvent;

public class BeanContextEvent_2 {
    public static void main(String[] args) {
        BeanContextEvent event = new BeanContextEvent(new BeanContext());
        BeanContext beanContext = event.getBeanContext();
        System.out.println(beanContext);
    }
}
