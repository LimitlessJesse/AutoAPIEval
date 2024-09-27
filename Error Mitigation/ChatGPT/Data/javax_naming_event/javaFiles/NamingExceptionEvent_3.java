import javax.naming.event.NamingExceptionEvent;
import javax.naming.event.NamingListener;

public class NamingExceptionEvent_3 {
    public static void main(String[] args) {
        NamingExceptionEvent event = new NamingExceptionEvent();
        NamingListener listener = new NamingListener() {
            @Override
            public void namingExceptionThrown(NamingExceptionEvent evt) {
                // Handle naming exception event
            }
        };
        
        event.dispatch(listener);
    }
}
