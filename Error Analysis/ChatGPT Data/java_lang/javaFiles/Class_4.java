import java.lang.reflect.Constructor;

public class Class_4 {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        
        for(Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
