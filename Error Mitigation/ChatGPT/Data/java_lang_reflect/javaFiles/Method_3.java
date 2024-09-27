import java.lang.reflect.Method;

public class Method_3 {
    public static void main(String[] args) {
        try {
            Method method = Method_3.class.getMethod("main", String[].class);
            Class<?>[] parameterTypes = method.getParameterTypes();
            
            System.out.println("Parameter types for method 'main':");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
