import java.security.GuardedObject;

public class GuardedObject_1 {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject("Secret", null);
        
        try {
            Object obj = guardedObject.getObject();
            System.out.println("Guarded Object: " + obj);
        } catch (SecurityException e) {
            System.out.println("Access to the guarded object is denied.");
        }
    }
}
