import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructor_2 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Constructor<?> constructor = clazz.getConstructor(String.class);
            String str = (String) constructor.newInstance("Hello");
            System.out.println(str);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
