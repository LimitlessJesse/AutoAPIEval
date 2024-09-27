import java.security.GuardedObject;

public class GuardedObject_1 {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject("Secret", null);
        
        try {
            Object obj = guardedObject.getObject();
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
