import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Field_2 {
    public static void main(String[] args) {
        Field[] fields = Field_2.class.getDeclaredFields();
        
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println("Field: " + field.getName() + ", Modifiers: " + Modifier.toString(modifiers));
        }
    }
}
