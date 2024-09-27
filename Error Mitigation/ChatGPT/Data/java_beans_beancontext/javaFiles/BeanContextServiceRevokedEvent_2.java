import java.beans.beancontext.BeanContextServiceRevokedEvent;

public class BeanContextServiceRevokedEvent_2 {
    public static void main(String[] args) {
        BeanContextServiceRevokedEvent event = new BeanContextServiceRevokedEvent(null, null);
        Class serviceClass = event.getServiceClass();
        System.out.println("Service Class: " + serviceClass);
    }
}
