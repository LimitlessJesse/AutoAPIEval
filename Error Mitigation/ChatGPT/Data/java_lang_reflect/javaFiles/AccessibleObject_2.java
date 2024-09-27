import java.lang.reflect.AccessibleObject;

public class AccessibleObject_2 {
    public static void main(String[] args) {
        AccessibleObject obj = new AccessibleObject() {
            @Override
            public boolean isAccessible() {
                return false;
            }
        };
        
        System.out.println("Is accessible: " + obj.isAccessible());
    }
}
