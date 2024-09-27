import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class BeanContextServiceAvailableEvent_2 {
    public static void main(String[] args) {
        BeanContextServiceAvailableEvent event = new BeanContextServiceAvailableEvent(null, null);
        Class<?> serviceClass = event.getServiceClass();
        System.out.println("Service Class: " + serviceClass.getName());
    }
}
