import java.beans.beancontext.BeanContext;

public class BeanContextEvent_3 {
    public static void main(String[] args) {
        BeanContext context = new BeanContext(); // Instantiate a BeanContext object
        BeanContextEvent event = new BeanContextEvent(); // Instantiate a BeanContextEvent object
        event.setPropagatedFrom(context); // Set the BeanContext from which the event was propagated
    }
}
