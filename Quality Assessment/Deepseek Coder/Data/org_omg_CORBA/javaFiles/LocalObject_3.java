import org.omg.CORBA.LocalObject;

public class LocalObject_3 {
    public static void main(String[] args) {
        LocalObject obj = new LocalObject() {
            // Implementation of LocalObject
        };

        String className = "org.omg.CORBA.LocalObject";
        boolean isInstance = obj._is_a(className);
        System.out.println("Is instance: " + isInstance);
    }
}
