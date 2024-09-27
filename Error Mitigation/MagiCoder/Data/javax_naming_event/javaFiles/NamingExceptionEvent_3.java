import javax.naming.event.NamingExceptionEvent;
import javax.naming.NamingException;

public class NamingExceptionEvent_3 {
    public static void main(String[] args) {
        NamingExceptionEvent event = new NamingExceptionEvent(new Object(), new NamingException("Test exception"));
        NamingException exception = event.getException();
        System.out.println(exception.getMessage());
    }
}
