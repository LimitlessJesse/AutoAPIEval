import java.security.GuardedObject;
import java.security.Guard;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.cert.Certificate;
import java.util.Enumeration;

public class GuardedObject_2 {
    public static void main(String[] args) {
        Guard guard = new Guard() {
            @Override
            public boolean isGuarded(ProtectionDomain domain, Permission permission) {
                return false;
            }

            @Override
            public void checkGuard(Object object) throws SecurityException {
            }
        };

        Object obj = new Object();
        GuardedObject guardedObject = new GuardedObject(obj, guard);

        try {
            Object result = guardedObject.getObject();
            System.out.println(result);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
