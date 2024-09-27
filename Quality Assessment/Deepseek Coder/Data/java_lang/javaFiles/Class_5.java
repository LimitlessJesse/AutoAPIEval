import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Class_5 {
    public static void main(String[] args) {
        Class<?> cls = ArrayList.class;
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
