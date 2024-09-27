import javax.naming.Name;
import javax.naming.Context;
import javax.naming.spi.NamingManager;
import java.util.Hashtable;

public class NamingManager_1 {
    public static void main(String[] args) {
        Object refInfo = null;
        Name name = null;
        Context nameCtx = null;
        Hashtable<?, ?> environment = new Hashtable<>();

        try {
            Object obj = NamingManager.getObjectInstance(refInfo, name, nameCtx, environment);
            System.out.println("Object created successfully: " + obj);
        } catch (Exception e) {
            System.out.println("Error creating object: " + e.getMessage());
        }
    }
}
