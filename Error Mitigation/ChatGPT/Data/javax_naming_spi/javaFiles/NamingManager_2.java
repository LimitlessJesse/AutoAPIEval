import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.NamingManager;
import java.util.Hashtable;

public class NamingManager_2 {
    public static void main(String[] args) {
        Hashtable<String, String> environment = new Hashtable<>();
        Context initialContext = null;
        
        try {
            initialContext = NamingManager.getInitialContext(environment);
            System.out.println("Initial context created successfully: " + initialContext);
        } catch (NamingException e) {
            System.out.println("Error creating initial context: " + e.getMessage());
        }
    }
}
