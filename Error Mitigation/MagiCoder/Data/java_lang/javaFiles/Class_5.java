import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Class_5 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Field[] fields = clazz.getFields();
            for (Field field : fields) {
                System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
