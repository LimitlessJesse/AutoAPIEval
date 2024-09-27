import java.lang.reflect.Constructor;

public class Constructor_2 {
    public static void main(String[] args) {
        try {
            Constructor<String> constructor = String.class.getConstructor(String.class);
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            
            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println("Exception Type: " + exceptionType.getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
