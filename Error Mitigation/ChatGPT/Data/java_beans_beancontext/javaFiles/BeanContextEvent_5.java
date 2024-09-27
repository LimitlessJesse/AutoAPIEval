import java.beans.beancontext.BeanContext;

public class BeanContextEvent_5 {
    public static void main(String[] args) {
        BeanContext context = new BeanContext(); // Create a BeanContext object
        BeanContextEvent event = new BeanContextEvent(); // Create a BeanContextEvent object
        event.setPropagatedFrom(context); // Set the BeanContext from which the event was propagated
    }
}
