import java.beans.beancontext.BeanContextServiceRevokedEvent;

public class BeanContextServiceRevokedEvent_5 {
    public static void main(String[] args) {
        BeanContextServiceRevokedEvent event = new BeanContextServiceRevokedEvent(null);
        boolean isInvalid = event.isCurrentServiceInvalidNow();
        System.out.println("Is current service invalid now? " + isInvalid);
    }
}
