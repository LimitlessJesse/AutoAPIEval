import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class AccessibleObject_1 {
    public static void main(String[] args) {
        try {
            Field field = SampleClass.class.getDeclaredField("privateField");
            field.setAccessible(true);
            // Further operations using the field...
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

class SampleClass {
    private String privateField;
}
