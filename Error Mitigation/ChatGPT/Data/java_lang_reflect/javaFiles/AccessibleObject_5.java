import java.lang.reflect.AccessibleObject;

public class AccessibleObject_5 {
    public static void main(String[] args) {
        AccessibleObject[] array = new AccessibleObject[1]; // Create an array of AccessibleObjects
        // Populate the array with AccessibleObject instances
        
        boolean flag = true; // Set the new value for the accessible flag
        
        try {
            AccessibleObject.setAccessible(array, flag); // Call the setAccessible method
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
