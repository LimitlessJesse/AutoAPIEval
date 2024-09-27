import java.lang.reflect.AccessibleObject;

public class AccessibleObject_1 {
    public static void main(String[] args) {
        AccessibleObject obj = // initialize your AccessibleObject here
        try {
            obj.setAccessible(true);
            System.out.println("Accessible flag set to true");
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
