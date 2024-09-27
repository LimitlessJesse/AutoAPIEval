import javax.naming.NamingException;
import javax.naming.event.NamingExceptionEvent;

public class NamingExceptionEvent_1 {
    public static void main(String[] args) {
        NamingExceptionEvent event = new NamingExceptionEvent(new Object(), new NamingException("Example Naming Exception"));
        NamingException exception = event.getException();
        System.out.println("Exception message: " + exception.getMessage());
    }
}
