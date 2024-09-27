import java.lang.reflect.Constructor;

public class Constructor_5 {
    public static void main(String[] args) {
        try {
            Constructor<String> constructor = String.class.getConstructor(String.class);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            
            System.out.println("Parameter types for String constructor:");
            for(Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
