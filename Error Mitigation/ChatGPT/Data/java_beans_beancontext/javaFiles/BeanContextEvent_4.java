import java.beans.beancontext.BeanContextEvent;

public class BeanContextEvent_4 {
    public static void main(String[] args) {
        BeanContextEvent event = new BeanContextEvent(null);
        boolean propagated = event.isPropagated();
        System.out.println("Is Propagated: " + propagated);
    }
}
